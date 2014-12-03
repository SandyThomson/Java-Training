
package com.datacash.training;

public class QSDemo {

	public static void main( String[] args ) {
		char[] sortChars = "Hello World!".toCharArray();

		System.out.print( "Original array: " );
		for ( char c : sortChars ) {
			System.out.print( c );
		}
		System.out.println();

		QuickSort.quickSort( sortChars );

		System.out.print( "Sorted array: " );
		for ( char c : sortChars ) {
			System.out.print( c );
		}
		System.out.println();
		;

	}

}
