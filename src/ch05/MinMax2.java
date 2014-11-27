package ch05;

// Use array initializers.
class MinMax2 {

	public static void main( String args[] ) {
		int nums[] = { 99, -10, 100123, 18, -978,
		    5623, 463, -9, 287, 49 };
		int min, max;

		min = max = nums[0];
		// this will now iterate over nums[0] which is unneccesary
		for ( int i : nums ) {
			if ( i < min ) min = i;
			if ( i > max ) max = i;
		}
		System.out.println( "Min and max: " + min + " " + max );
	}
}

