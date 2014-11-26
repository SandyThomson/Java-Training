/*
 * Find the average of ten doubles
 */

public class Average {
	
	public static void main ( String[] args ) {
    double[] values = { 46.0, 19.5, -8, 6.229, -1.01, 289, 66.2, 21, 705, 4 };
    double sum = 0.0;
	
    for ( double value : values ) sum += value;
    
    System.out.println( "The average is " + sum / values.length );

	}
}
