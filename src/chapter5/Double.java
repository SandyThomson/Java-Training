package chapter5;

import java.util.Random;

public class Double {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		
		System.out.print( "Calculating average of " );
		
		double[] values = new double[10];
		for ( int i = 0; i < 10; i++ ) {
			values[i] = randomGenerator.nextDouble() * randomGenerator.nextInt(100);
			System.out.print( values[i] + " " );
		}
		
		System.out.println();
		
		double average = average(values);
		
		System.out.println( "The average is " + average );
	}
	
	public static double average( double[] values ) {
		double sum = 0;
		
		for ( double x: values ) sum += x;
		
		double average = sum / values.length;
		
		return average;
	}

}
