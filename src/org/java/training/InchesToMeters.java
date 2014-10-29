package org.java.training;

public class InchesToMeters {

	public static final double METERS_PER_INCH = 1. / 39.37;

	public static void main(String[] args) {
		System.out.println( String.format("%8s | %s", "Inches", "Meters") );

		for(int inches = 1, feet = 12; inches <= feet * 12; ++inches ) {		
			System.out.println( String.format("%8d | %.4f", inches, inches * METERS_PER_INCH) );

			if(inches % 12 == 0)
				System.out.println();
		}

	}

}
