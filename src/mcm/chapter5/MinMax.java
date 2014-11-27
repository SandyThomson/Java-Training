package mcm.chapter5;


public class MinMax {

	public static void main( String[] args ) {

		int[] nums = { 1, 4, 3, 5, 7, 8, 9, 10, 12, 100, 50, 30, 31, 25, 10, 50, 40, 60, -5, -20 };
		
		int min = 0;
		int max = 0;
		
		for ( int i : nums ) {
			min = i < min ? i : min;
			max = i > max ? i : max;
		}

		System.out.println( "Min: " + min );
		System.out.println( "Max: " + max );

	}

}
