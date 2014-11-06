package mcm_ch2;

import java.util.stream.LongStream;

public class PrimeNumberCalculator {

	/**
	 * Function to calculate and print the prime numbers between a range of values
	 * @param start
	 * @param end
	 */
	public static void calculatePrimeNumbers(long start, long end){
	
		System.out.println( "The first " + (end++) + " prime numbers are:" );
		//Uses Java 8's snazzy new lambda expressions to figure out the prime numbers between a range
		//No idea how efficient these are, just using them to see how they work really
		LongStream.range(start, end++).forEach(
			i -> {
				if(i>=2){
					boolean notprime = LongStream.range(2, i).allMatch(
							j -> {
								return (j < i && i%j != 0);
							});
					System.out.print(notprime ? "Prime: "+i+"\n": "");
				}});
	}
	

	/**
	 * Main method to run the prime number calculator
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Calculate the prime numbers and at the same time
		//See how hot my Macbook Pro can get
		calculatePrimeNumbers( 1, 9999999999999L );
		
		//IT BURNS - OUCH!!!
	}

}
