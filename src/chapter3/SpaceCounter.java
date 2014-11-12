/**
 * 
 */
package chapter3;

import java.io.IOException;

/**
 * @author Andy.Diack
 *
 */
public class SpaceCounter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println( "This program counts the number of spaces in a sentence. Please enter your sentence below to find out how many spaces it contains:" );
		
		int spaces = 0;
		char character;
		
		do {
			character = (char) System.in.read();
			if ( character == '.' ) {
				System.out.println( "Your sentence contained " + spaces + " spaces." );
				break;
			} else if ( character == ' ' ) {
				spaces++;
			}
		} while ( character != '\n' );

	}

}
