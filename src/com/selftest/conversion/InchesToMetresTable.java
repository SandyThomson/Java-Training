package com.selftest.conversion;
import java.util.stream.IntStream;

public class InchesToMetresTable {
	private static final double INCHES_TO_METRES_RATIO = 39.37;
	
	public static void main( String[] args ) {
		
		// 12 feet => 12 x 12 inches => 144 inches.
		IntStream.rangeClosed( 1, 144 ).forEach( 
				number -> {
					System.out.println( String.format( "%d inch(es) is %.2f metres.", number, ( number / INCHES_TO_METRES_RATIO ) ) );
					if ( number % 12 == 0 ) System.out.println();
				}
		);
	}
	
}
