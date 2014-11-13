package mcm_ch3;

import java.io.IOException;

public class CharacterReader {

	public static void main( String[] args ) {
		System.out.println( "*** Enter a Phrase and end with (.) can be multiple lines ***" );

		StringBuilder phrase = new StringBuilder();

		char in = ' ';
		do{
			try {
				in = (char) System.in.read();
				phrase.append( in );
			}
			catch ( IOException e ) {
				System.out.println( "Error reading input" );
			}
		}
		while ( in != '.' );

		System.out.println( "*****************************" );
		System.out.println( "Phrase: " + phrase );

		//Find out the number of spaces in the phrase
		int spaces = phrase.toString().length() - phrase.toString().replaceAll( " ", "" ).length();

		System.out.println( "No Spaces: " + spaces );
		System.out.println( "*****************************" );


	}

}
