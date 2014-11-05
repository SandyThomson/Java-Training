
package com.training.chaptertwo;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main( String[] args ) {

		theBoringWay( 100 );

		theLessBoringWay( 100 );

	}

	private static void theBoringWay( int max ) {

		System.out.println( "Prime numbers:" );

		NUMBERS: for ( int i = 2 ; i <= max ; i++ ) {

			for ( int j = 2 ; j <= i / 2 ; j++ ) {
				if ( i % j == 0 ) {
					continue NUMBERS;
				}
			}
			System.out.print( i + ", " );
		}
		System.out.println();

	}

	private static void theLessBoringWay( int max ) {

		System.out.println( "Prime numbers:" );

		List<Integer> primes = new ArrayList<>();

		NUMBERS: for ( int i = 2 ; i <= max ; i++ ) {
			for ( Integer prime : primes ) {
				if ( i % prime == 0 ) {
					continue NUMBERS;
				}
			}
			primes.add( i );
		}

		primes.stream().map( d -> String.format( "%d, ", d ) ).forEach( System.out::print );
		System.out.println();

	}

}
