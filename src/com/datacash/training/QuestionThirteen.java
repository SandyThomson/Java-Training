
package com.datacash.training;

public class QuestionThirteen {

	public static void main( String[] args ) {

		System.out.println( "Sum of 1 arg: " + sum( 1 ) );
		System.out.println( "Sum of 3 args: " + sum( 1, 5, 16 ) );
		System.out.println( "Sum of 0 args: " + sum() );

	}

	private static int sum( int ... toSum ) {

		int sum = 0;

		for ( int i : toSum ) {
			sum += i;
		}

		return sum;
	}

}
