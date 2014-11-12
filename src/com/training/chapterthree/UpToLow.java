
package com.training.chapterthree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UpToLow {

	public static void main( String[] args ) throws IOException {

		char input;
		List<Character> output = new ArrayList<Character>();
		int count = 0;

		System.out.print( "Enter a sentence: " );

		do {
			input = (char) System.in.read();
			if ( Character.isLowerCase( input ) ) {
				output.add( Character.toUpperCase( input ) );
				count++;
			}
			else if ( Character.isUpperCase( input ) ) {
				output.add( Character.toLowerCase( input ) );
				count++;
			}
			else {
				output.add( input );
			}

		}
		while ( input != '.' );

		System.out.println( "Total case changes: " + count );
		System.out.println( "Your new sentence: " );

		output.stream().forEach( System.out::print );

	}

}
