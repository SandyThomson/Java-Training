
public class Sum {
  public static void main (String args[]){
	  int data[] = {1,2,3};
	  System.out.println("The sum is " + sum(data)); 
  }
  
  static int sum(int ... i){
	  int sum = 0;
	  for(int val : i) sum += val;
	  return sum;
  }
}
