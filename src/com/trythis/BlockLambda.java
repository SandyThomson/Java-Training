
package com.trythis;

import java.util.stream.IntStream;

public class BlockLambda {

	interface NumericFunction<T> {
		T function( T n );
	}

	public static void main( String[] args ) {

		NumericFunction<Integer> smallestFactor = n -> {
			n = n < 0 ? -n : n;
			for ( int i = 2 ; i <= n / i ; i++ )
				if ( n % i == 0 )
				  return i;
			return 1;
		};

		IntStream.iterate( 12, i -> i - 1 ).limit( 6 )
		         .forEach( v -> System.out.printf( "Smallest factor of %d is %d%n", v, smallestFactor.function( v ) ) );
	}

}
