
package com.datacash.training;

import java.util.Arrays;
import java.util.List;

public class Bubble {

	public static void main( String[] args ) {

		bubbleSortArray();

		bubbleSortList();

	}

	private static void bubbleSortArray() {

		int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };

		int temp;
		int size = nums.length;

		// Display original array
		System.out.println( "Original array is:" );
		for ( int n = 0 ; n < size ; n++ ) {
			System.out.print( " " + nums[n] );
		}
		System.out.println();

		// bubble sort
		for ( int a = 1 ; a < size ; a++ ) {
			for ( int b = size - 1 ; b >= a ; b-- ) {
				if ( nums[b - 1] > nums[b] ) {
					temp = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = temp;
				}
			}
		}

		// Display sorted array
		System.out.println( "Sorted array is:" );
		for ( int n = 0 ; n < nums.length ; n++ ) {
			System.out.print( " " + nums[n] );
		}
		System.out.println();

	}
	
	private static void bubbleSortList() {
		List<Integer> nums = Arrays.asList( 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 );
		
		int temp;
		int size = nums.size();
		
		// Display original list
		System.out.println( "Original list is:" );
		nums.stream().map( d -> String.format( " %d", d ) ).forEach( System.out::print );
		System.out.println();

		// bubble sort
		for ( int a = 1 ; a < size ; a++ ) {
			for ( int b = size - 1 ; b >= a ; b-- ) {
				if ( nums.get( b-1 ) > nums.get( b ) ) {
					temp = nums.get( b-1 );
					nums.set( b-1, nums.get( b ) );
					nums.set( b, temp );
				}
			}
		}

		// Display sorted list
		System.out.println( "Sorted list is:" );
		nums.stream().map( d -> String.format( " %d", d ) ).forEach( System.out::print );
		System.out.println();
	}


}
