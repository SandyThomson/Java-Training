
package com.trythis;

import java.util.stream.Stream;

public class StringTest {

	private static final String STRING = "This is a test";

	interface Test<T> {
		boolean test( T a, T b );
	}

	public static void main( String[] args ) {
		Test<String> isIn = ( a, b ) -> a.contains( b );

		System.out.printf( "Testing string: %s%n", STRING );
		Stream.of( "is a", "xyz" )
		      .forEach( s -> System.out.printf( "'%s' %s%n", s, isIn.test( STRING, s ) ? "found" : "not found" ) );
	}

}
