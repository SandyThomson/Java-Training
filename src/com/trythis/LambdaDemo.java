
package com.trythis;

import java.util.stream.Stream;

public class LambdaDemo {

	interface MyValue<T> {
		T getValue();
	}

	interface MyParamValue<T> {
		T getValue( T v );
	}

	public static void main( String[] args ) {

		MyValue<Double> myValue = ( ) -> 98.6;
		System.out.printf( "Constant value: %.1f%n", myValue.getValue() );

		MyParamValue<Double> myParamValue = ( n ) -> 1.0 / n;
		Stream.of( 4.0, 8.0 )
		      .forEach( n -> System.out.printf( "Reciprocal of %.0f is %s%n", n, myParamValue.getValue( n ) ) );
	}

}
