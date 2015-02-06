
package com.selftest;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class MyIntNumber {

	private int value;

	MyIntNumber( int number ) {
		this.value = number;
	}

	int getNumber() {
		return value;
	}

	boolean isFactor( int number ) {
		return value % number == 0;
	}

	boolean hasCommonFactor( int number ) {
		return IntStream.range( 2, value )
		                .anyMatch( i -> isFactor( i ) && number % i == 0 );
	}
}

public class CommonFactor {

	public static void main( String[] args ) {
		Stream.of( 12, 16 )
		      .map( MyIntNumber::new )
		      .forEach( n -> {
		      	
			IntPredicate predicate = n::isFactor;
			System.out.printf( "3 is %s factor of %d%n", predicate.test( 3 ) ? "a" : "not a", n.getNumber() );

			predicate = n::hasCommonFactor;
			System.out.printf( "9 and %d %s a common factor%n", n.getNumber(), predicate.test( 9 ) ? "have" : "don't have" );
			
		} );
	}

}
