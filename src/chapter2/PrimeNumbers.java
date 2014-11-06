/**
 * 
 */
package chapter2;

import java.util.ArrayList;

/**
 * @author Andy.Diack
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object[] primeNumbers = findPrimeNumbersUpToAHundred();
		for ( int i = 0; i < primeNumbers.length; i++ ) {
			System.out.println( primeNumbers[i] + " is a prime number." );
		}

	}
	
	public static Object[] findPrimeNumbersUpToAHundred() {
		ArrayList<Integer> primeNumbers = new ArrayList<>();
		
		for ( int i = 2; i <= 100; i++ ) {
			boolean isAPrime = true;
			
			for ( int j = 2; j < i; j++ ) {
				if ( ( i % j ) == 0 ) {
					isAPrime = false;
				}
			}
			
			if ( isAPrime ) {
				primeNumbers.add(i);
			}
		}
		
		return primeNumbers.toArray();
	}

}
