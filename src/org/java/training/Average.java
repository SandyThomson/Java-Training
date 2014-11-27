package org.java.training;

public class Average {
	
	public static void main(String[] args) {
		double[] vals = { 24.03, 25_325.34, 22.0, 1.5, -3_994.543, 2_435.33, 100.00, 293.34, 34, 2_385.34 };
		
		double sum = 0.0;
		for( int i = vals.length; i > 0; sum += vals[--i] );
		
		System.out.printf( "Average is %.4f", sum / vals.length );
	}

}
