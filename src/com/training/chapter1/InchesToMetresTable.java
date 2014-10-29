
package com.training.chapter1;

import java.util.stream.IntStream;

public class InchesToMetresTable {

	public static void main( String[] args ) {

		try {
			IntStream.rangeClosed( 1, Integer.parseInt( args[0] ) ).forEach( new InchesToMetresCalculator() );
		}
		catch ( NumberFormatException nfe ) {
			System.out.println( "Argument is not a valid number!" );
		}

	}

}
