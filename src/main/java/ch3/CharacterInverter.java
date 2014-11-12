/**
 * 
 */
package ch3;

import java.io.IOException;

/**
 * @author Mike
 *
 */
public class CharacterInverter {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out
				.println("Please enter a line of text, and i will invert its case:");

		char input;
		StringBuilder newString = new StringBuilder();

		// Keep reading until the end of the line.
		while ((input = (char) System.in.read()) != '.') {
			if( input >= 'a' && input <= 'z'){
				input -= 32;
			}
			else if ( input >='A' && input <= 'Z'){
				input += 32;
			}
			newString.append(input);
		}
		newString.append('.');

		// consume any additional characters
		while ((input = (char) System.in.read()) != '\n')
			;
		
		System.out.println(newString);
	}

}
