package mcm.chapter4;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageFinder {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,4,6,7,8,9,4,2,5,6,4,7,3,21,33,20,7,8,10,11};
		double average = (Arrays.stream(numbers).sum())/numbers.length;	//This is slightly cheating, but I wanted to play around more with streams
		
		System.out.println("The average is: "+ average);	//Prints 8.0
		
		//Even bigger cheat is as follows:
		OptionalDouble avg = Arrays.stream(numbers).average();
		System.out.println("Average found by cheating is: "+avg.getAsDouble());		//Prints 8.476190476190476 N.b., doesn't round like the integer division above
	
	}

}
