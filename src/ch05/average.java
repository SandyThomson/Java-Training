package ch05;

public class average {

	public static void main( String args[] ) {
		double nums[] = { 99, -10, 100123, 18, -978,
		    5623, 463, -9, 287, 49 };

		double sum = 0;

		for ( double i : nums ) {
			sum += i;
		}
		System.out.println( "sum: " + sum );
		System.out.println( "avg: " + sum / nums.length );
	}

}
