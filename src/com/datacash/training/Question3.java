
package com.datacash.training;

public class Question3 {

	public static void main( String[] args ) {

		double[] toAverage = { 64.93, 82.97, 69.19, 17.66, 58.02, 37.55, 56.74, 37.38, 65.88, 39.90 };

		double sum = 0.0;

		for ( double value : toAverage ) {
			sum += value;
		}

		System.out.println( "Average is " + sum / toAverage.length );

	}

}
