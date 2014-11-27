/**
 * 
 */
package main.java;

import java.util.Random;

/**
 * @author Mike
 *
 */
public class Averagenator {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		int[] values = new int[10];

		// populate some random number between 0 and 100
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			values[i] = random.nextInt(100);
		}

		// calculate the average
		int average = 0;
		for (int x : values) {
			average += x;
		}
		average = average / values.length;

		// print out some results
		System.out.print("Values: ");
		for (int val : values) {
			System.out.print(val + " ");
		}

		System.out.println("\nAverage is: " + average);

	}

}
