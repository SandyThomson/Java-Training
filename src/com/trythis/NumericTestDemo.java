
package com.trythis;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class NumericTestDemo {

	interface NumericTest<T> {
		boolean test( T n, T m );
	}

	@SuppressWarnings( "serial" )
	public static void main( String[] args ) {

		NumericTest<Integer> isFactor = ( n, d ) -> n % d == 0;
		Stream.of( 2, 3 )
		      .forEach( d -> System.out.printf( "%d is %s factor of %d%n", d, isFactor.test( 10, d ) ? "a" : "not a", 10 ) );

		NumericTest<Integer> lessThan = ( n, m ) -> n < m;
		Map<Integer, Integer> values = new HashMap<Integer, Integer>() {
			{
				put( 2, 10 );
				put( 10, 2 );
			}
		};
		values.forEach( ( n, m ) -> System.out.printf( "%d is %s than %d%n", n, lessThan.test( n, m ) ? "less" : "not less", m ) );

		NumericTest<Integer> absEqual = ( n, m ) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
		Stream.of( -4, -5 )
		      .forEach( v -> System.out.printf( "Absolute values of %d and %d are %s%n", 4, v, absEqual.test( 4, v ) ? "equal" : "not equal" ) );
	}

}
