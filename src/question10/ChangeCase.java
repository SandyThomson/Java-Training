package question10;

import java.io.IOException;

public class ChangeCase {

	public static void main( String[] args ) throws IOException {
		char key = 'a';
		int count = 0;

		System.out.println( "Enter some text:" );

		while ( key != '.' ) {
			key = (char) System.in.read();
			if ( (key >= 'a') & (key <= 'z') ) {
				key -= 32;
				count++;
			}
			else if ( (key >= 'A') & (key <= 'z') ) {
				key += 32;
				count++;
			}
			System.out.print( key );
		}
		System.out.println( "There were a total of " + count + " case changes" );
	}
}
