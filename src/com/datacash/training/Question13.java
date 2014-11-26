
package com.datacash.training;

public class Question13 {

	public static void main( String[] args ) {
		int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };

		int min, max;

		min = max = nums[0];

		for ( int num : nums ) {
			if ( num > max ) {
				max = num;
			}
			else if ( num < min ) {
				min = num;
			}
		}

		System.out.println( "Min and max: " + min + " " + max );
	}

}
