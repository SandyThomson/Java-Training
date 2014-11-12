/**
 * 
 */
package ch3;

import java.io.IOException;

/**
 * @author Mike
 *
 */
public class Spaaaaaaaaaaace {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out
				.println("Please enter a single sentane and I will count the spaces within it:");

		char input;
		int spaceCount = 0;
		// Keep reading until the end of the line.
		while ((input = (char) System.in.read()) != '.') {
			if (input == ' ') {
				spaceCount++;
			}
		}

		// consume any additional characters
		while ((input = (char) System.in.read()) != '\n')
			;

		System.out.println("Your phase contained " + spaceCount + " spaces!");
	}

}
