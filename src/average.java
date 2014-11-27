

public class average {
	public static void main( String args[] ) {
		double myArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double sum = 0.0;

	  for (double val : myArray) sum += val;

		System.out.println( "The average is " + (sum / myArray.length) );
	}
}
