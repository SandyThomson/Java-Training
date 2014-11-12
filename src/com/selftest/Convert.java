package com.selftest;

import java.io.IOException;

public class Convert {

	private static final char PERIOD = '.';
	
	private static final int TO_UPPER = -32;
	private static final int TO_LOWER = 32;
		
	public static void main( String[] args ) throws IOException {
		int count = 0;
		
		char c;
		while ( ( c = (char)System.in.read() ) != PERIOD ) {
			
			// convert characters within the [A-Za-z] range.
			if ( Character.isLetter( c ) ) {
				count++;
				c += ( Character.isLowerCase( c ) ? TO_UPPER : TO_LOWER );
			}
			System.out.print( c );
		}
		System.out.println( String.format( "\nConverted case for %d characters.", count ) );
	}
	
}
