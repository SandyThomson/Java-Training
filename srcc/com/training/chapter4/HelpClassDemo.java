
package com.training.chapter4;

import java.io.IOException;

public class HelpClassDemo {

	public static void main( String[] args ) throws IOException {

		System.out.println( "Help on:" );
		char input, ignore;

		do {

			Help.printChoices();

			input = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			}
			while ( ignore != '\n' );

		}
		while ( Help.printOption( input ) );

	}

}
