package com.selftest;

import java.io.IOException;

public class CountSpaces {

	private static final char PERIOD = '.';
	private static final char SPACE  = ' ';
	
	public static void main( String[] args ) throws IOException {
		int count = 0;
		
		char c;
		while ( ( c = (char)System.in.read() ) != PERIOD ) {
			if ( SPACE == c ) count++;
		}
		System.out.println( String.format( "Found %d spaces.", count ) ); 		
	}
	
}
