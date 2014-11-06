/**
 * 
 */
package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Mike
 *
 */
public class Primer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a number, or leave blank for a list: ");
		String input = scanner.nextLine();
		scanner.close();
		System.out.println();

		/*
		 *  Check if the user entered a number.
		 *  If they didn't we will print all the numbers between 1 and 100, specifying if they are prime or not.
		 *  If a number is specified then we will workout specifically for that number
		 */
		if (input.equals("")) {
			// loop between 1 and 100
			for (int i = 1; i < 100; i++) {
				// print the output
				System.out.print(i);
				if (isPrime(i)){
					System.out.println(" is prime!");					
				}
				else{
					System.out.println(" is not prime!");
				}
				
			}
		} 
		else {
			// parse the number they passed in
			BigInteger toPrime = null;
			try {
				toPrime = new BigInteger(input);
			}
			catch (NumberFormatException nfe) {
				throw new RuntimeException() {
					private static final long serialVersionUID = 314159L;
					String smessage = "Please enter a number!";
				};
			}

			// Print the output
			System.out.print(toPrime);
			if (isPrime(toPrime)) {
				System.out.println(" is prime!");
			}
			else {
				System.out.println(" is not prime");
			}

		}

	}

	/**
	 * Calculates if the given number is prime or not.
	 * 
	 * @param isPrime The number to work out
	 * @return Whether the number was prime or not.
	 */
	private static boolean isPrime(BigInteger isPrime) {
		//return = isPrime.isProbablePrime(1);

		for (BigInteger i = new BigInteger("2"); i.compareTo(isPrime) < 0; i = i.add(BigInteger.ONE)) {
			BigInteger result = isPrime.mod(i);

			if (result.equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Calculates if the given number is prime or not.
	 * 
	 * @param isPrime The number to work out
	 * @return Whether the number was prime or not.
	 */
	private static boolean isPrime(int isPrime) {
		for( int x = 2; x < isPrime; x++){
			if ((isPrime % x) == 0){
				return false;
			}
		}
		return true;
	}

}
