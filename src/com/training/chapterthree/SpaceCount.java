
package com.training.chapterthree;

import java.io.IOException;

public class SpaceCount {

	public static void main( String[] args ) throws IOException {

		int count = 0;
		char input;

		System.out.print( "Enter a sentence: " );

		do {
			input = (char) System.in.read();
			if ( Character.isSpaceChar( input ) ) {
				count++;
			}

		}
		while ( input != '.' );

		System.out.println( "Total number of spaces: " + count );

	}

}
