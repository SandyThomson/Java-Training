package mcm.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSorter {
	
	public List<String> sortStrings(List<String> strings){
	
		return mergeSort(strings);
		
	}
	
	/**
	 * Mergesort, for fun... or something
	 * @param strings
	 * @return
	 */
	public List<String> mergeSort(List<String> strings){
		
		if(strings.size() < 2){
			return strings;
		}
		else{
			
			//Split
			int half1 = strings.size() / 2;
			
			List<String> left = new ArrayList<String>(strings.subList(0, half1));
			List<String> right = new ArrayList<String>(strings.subList(half1, strings.size()-1));
			
			return merge(mergeSort(left), mergeSort(right));
		}
		
	}
	
	/**
	 * Check and merge the two lists
	 * @param left
	 * @param right
	 * @return
	 */
	public List<String> merge(List<String> left, List<String> right){
			
		if(left.size() == 0){
			return right;
		}
		
		if(right.size() == 0){
			return left;
		}
		
		List<String> result = new ArrayList<String>();
		String next;
		
		//System.out.println("Comparing: "+left.get(0)+" with "+right.get(0)+" result: "+left.get(0).compareTo(right.get(0)));
		
		if(left.get(0).compareTo(right.get(0)) > 0){
			
			next = right.get(0);
			right.remove(0);
		}else{
			next = left.get(0);
			left.remove(0);
		}
		
		result.add(next);
		result.addAll(merge(left,right));
		
		return result;
	}
	
	
	/**
	 * Get a list of names
	 * @return
	 */
	public List<String> getTestNames(){
		
		//Test names generated from http://listofrandomnames.com/
		String[] names ={"Margarita","Dorathy","Shaunna","Lexie","Vinita","Mckinley","Bridgette","Kimberely","Neil",
				"Elvina","Sadie","Jarrett","Carol","Vasiliki","Corrin","Luetta","Cathy","Kaycee","Idell","Wei","Sharice",
				"Larita","Corinne","Wilfred","Argentina","Wanetta","Teressa","Alycia","Patricia","Lael","Britt","Tyrone",
				"Shanita","Leonia","Yang","Abbey","Latricia","Hiedi","Myrle","Paola","Wava","Agueda","Ciera","Lee","Shaunta",
				"Denice","Lenita","Kenya","Monroe","Duncan" };
		
		return Arrays.asList(names);
	}	
	
	public static void main(String[] args){
		
		StringSorter sorter = new StringSorter();
		
		List<String> sortedNames = sorter.sortStrings(sorter.getTestNames());
		
		System.out.println("Sorted List:");
		
		for(String name : sortedNames){
			System.out.println(name);
		}

		
	}
	
}
