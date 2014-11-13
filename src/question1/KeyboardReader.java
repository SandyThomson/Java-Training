package question1;

import java.io.IOException;

public class KeyboardReader {
	public static void main( String[] args ) throws IOException {
		char key = 'a';
		int count = 0;

		System.out.println( "Enter some text:" );

		while ( key != '.' ) {
			key = (char) System.in.read();
			if ( key == ' ' ) count++;
		}
		System.out.println( "There were a total of " + count + " spaces before the first '.' in the input text." );
	}
}
