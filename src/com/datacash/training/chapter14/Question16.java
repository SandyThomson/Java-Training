
package com.datacash.training.chapter14;

interface IntPredicate {

	boolean test( int n );
}

class MyIntNum {

	private int v;

	public MyIntNum( int x ) {
		v = x;
	}

	public int getNum() {
		return v;
	}

	// Return true if n is a factor of v.
	private boolean isFactor( int n ) {
		return (v % n) == 0;
	}

	// Return true if n is a factor of i.
	private boolean isFactor( int n, int i ) {
		return (i % n) == 0;
	}

	public boolean hasCommonFactor( int i ) {

		for ( int n = 2 ; n < v / n ; n++ ) {
			if ( isFactor( n ) && isFactor( n, i ) ) {
				return true;
			}
		}
		return false;

	}
}

public class Question16 {

	public static void main( String args[] ) {

		MyIntNum myNum = new MyIntNum( 12 );

		// Here, a method reference to hasCommonFactor on myNum is created.
		IntPredicate ip = myNum::hasCommonFactor;

		// Now, it is used to call hasCommonFactor() via test().
		for ( int i = 1 ; i < 10 ; i++ ) {
			if ( ip.test( i ) ) {
				System.out.println( i + " shares a factor with "
				    + myNum.getNum() );
			}
		}

	}

}
