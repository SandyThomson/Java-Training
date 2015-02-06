
package com.trythis;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaArgumentDemo {

	interface StringFunction {
		String apply( String s );
	}

	private static final StringFunction REVERSE = s -> IntStream.rangeClosed( 1, s.length() )
	                                                            .mapToObj( i -> String.valueOf( s.charAt( s.length() - i ) ) )
	                                                            .collect( Collectors.joining() );

	private static String change( StringFunction functor, String s ) {
		return functor.apply( s );
	}

	public static void main( String[] args ) {
		String input = "Lambda Expressions Expand Java";
		System.out.printf( "Input:%s%n", input );
		System.out.printf( "The reversed string is: %s%n", change( REVERSE, input ) );
		System.out.printf( "The string with spaced replaced is: %s%n", change( s -> s.replaceAll( " ", "-" ), input ) );
		System.out.printf( "The string in reversed case is: %s%n", change( s -> IntStream.rangeClosed( 0, s.length() - 1 )
		                                                                                 .mapToObj( s::charAt )
		                                                                                 .map( c -> Character.isUpperCase( c ) ? Character.toLowerCase( c ) : Character.toUpperCase( c ) )
		                                                                                 .map( String::valueOf )
		                                                                                 .collect( Collectors.joining() ), input ) );
	}

}
