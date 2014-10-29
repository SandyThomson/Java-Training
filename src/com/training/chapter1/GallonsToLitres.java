
package com.training.chapter1;

public class GallonsToLitres {

	// The ratio of litres per gallon
	private static final double ratio = 3.7854;

	public static void main( String[] args ) {

		double gallons = 10.0; //Start with 10 gallons

		double litres = gallons * ratio; // Convert gallons to litres

		System.out.println( gallons + " gallons is " + litres + " litres" ); // Output result

	}

}
