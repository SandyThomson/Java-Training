
package com.selftest;

import java.util.stream.IntStream;

public class Factorial {

	interface NumericFunction<T> {
		T apply( T t );
	}

	private static final NumericFunction<Integer> FACTORIAL = n -> {
		return IntStream.rangeClosed( 2, n )
		                .reduce( 1, ( a, b ) -> a * b );
	};

	public static void main( String[] args ) {
		IntStream.rangeClosed( 1, 5 )
		         .forEach( i -> System.out.printf( "%d -> %d%n", i, FACTORIAL.apply( i ) ) );
	}

}
