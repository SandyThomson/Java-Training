

public class minMax {
  public static void main(String args[]){
  	int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
  	int min    = nums[0];
  	int	max    = nums[0];
  	
  	for (int val : nums){
  		if (val < min) min = val;
  		if (val > max) max = val;
  	}
    System.out.println("Min and max: " + min + " " + max);
  }
}
