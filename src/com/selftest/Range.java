
package com.selftest;

import java.util.stream.IntStream;

public class Range {

	interface MyTest<T> {
		boolean testing( T t );
	}

	private static MyTest<Integer> inRange = n -> n >= 10 && n <= 20;

	public static void main( String[] args ) {
		IntStream.rangeClosed( 0, 30 )
		         .forEach( i -> System.out.printf( "%d:%s%n", i, inRange.testing( i ) ) );
	}

}
