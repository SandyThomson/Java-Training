
package com.training.chapter1;

public class GallonsToLitresTable {

	// The ratio of litres per gallon
	private static final double ratio = 3.7854;

	public static void main( String[] args ) {

		double litres;

		for ( double gallons = 1 ; gallons <= 100 ; gallons++ ) {

			litres = gallons * ratio; // Convert gallons to litres

			System.out.println( gallons + " gallons is " + litres + " litres" ); // Output result

			if ( gallons % 10 == 0 ) {
				System.out.println(); // Output blank line every 10 lines
			}

		}

	}

}
