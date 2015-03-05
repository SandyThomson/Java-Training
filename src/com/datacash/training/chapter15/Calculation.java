
package com.datacash.training.chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Calculation {

	private int value;
	private static final List<String> MENU = Arrays.asList( "Calculator Options:", "1) Add", "2) Subtract", "3) Multiply", "4) Divide (rounded)", "5) Complete" );

	public int getValue() {
		return value;
	}

	public void setValue( int value ) {
		this.value = value;
	}

	public void process() throws IOException {

		BinaryOperator<Integer> method = null;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		do {
			calculate( method, getInput( "Enter a value:", br ) );
			System.out.println();

			System.out.println( "Current value: " + getValue() );
			System.out.println();

			MENU.stream().forEach( System.out::println );

			method = getAction( getInput( "Enter an option:", br ) );
			System.out.println();

		}
		while ( method != null );

		System.out.println();

	}

	private void calculate( BinaryOperator<Integer> method, int input ) {
		if ( method == null ) {
			setValue( input );
			return;
		}
		setValue( method.apply( getValue(), input ) );
	}

	private static BinaryOperator<Integer> getAction( int actionId ) {

		switch ( actionId ) {
			case 1:
				return ( a, b ) -> a + b;
			case 2:
				return ( a, b ) -> a - b;
			case 3:
				return ( a, b ) -> a * b;
			case 4:
				return ( a, b ) -> Math.round( a / b );
			default:
				return null;
		}

	}

	private static int getInput( String displayMessage, BufferedReader br ) throws IOException {

		while ( true ) {
			try {
				System.out.println( displayMessage );
				return Integer.parseInt( br.readLine() );
			}
			catch ( NumberFormatException nfe ) {
				System.out.println( "Not a number! Please try again!" );
				continue;
			}
		}
	}
}
