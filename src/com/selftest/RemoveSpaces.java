
package com.selftest;

public class RemoveSpaces {

	interface StringFunction {
		String apply( String s );
	}

	private static String change( StringFunction functor, String s ) {
		return functor.apply( s );
	}

	public static void main( String[] args ) {
		String input = "Lambda Expressions Expand Java";
		System.out.printf( "Input:%s%n", input );
		System.out.printf( "The string without spaces is: %s%n", change( s -> s.replaceAll( " ", "" ), input ) );
	}

}
