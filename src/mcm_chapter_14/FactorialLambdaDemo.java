package mcm_chapter_14;

import java.math.BigInteger;


interface MyFunc<T, N> {

	T func( N n );
}

public class FactorialLambdaDemo {

	public static void main( String[] args ) {
		
		MyFunc<BigInteger, Integer> factorialF = ( n ) -> {
			BigInteger factorial = BigInteger.valueOf( 1 );

			for ( int i = 1 ; i <= n ; i++ ) {
				factorial = factorial.multiply( BigInteger.valueOf( i ) );
			}

			return factorial;
		};

		System.out.println( "Factorial for 50 = " + factorialF.func( 50 ) );

	}

}
