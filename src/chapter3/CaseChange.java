/**
 * 
 */
package chapter3;

import java.io.IOException;

/**
 * @author Andy.Diack
 *
 */
public class CaseChange {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println( "Please enter text to convert lower case to upper case and vice versa:" );
		
		int changes = 0;
		char character;
		
		do {
			character = (char) System.in.read();
			if ( character >= 'A' && character <= 'Z' ) {
				changes++;
				character += 32;
			}
			else if ( character >= 'a' && character <= 'z' ) {
				changes++;
				character -= 32;
			}
			else if ( character == '.' ) {
				System.out.println( "." );
				break;
			}
			
			System.out.print( character );
		} while ( character != '\n' );
		
		System.out.println( changes + " characters had their case changed." );
	}

}
