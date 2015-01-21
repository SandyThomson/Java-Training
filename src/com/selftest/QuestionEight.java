
package com.selftest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QuestionEight {

	private static final String FILE = "src/com/selftest/file.txt";
	private static final String COPY = String.format( "%s.txt", QuestionEight.class.getSimpleName() );

	public static void main( String[] args ) {
		try (FileReader reader = new FileReader( FILE );
		     FileWriter writer = new FileWriter( COPY )) {
			for ( int i = reader.read() ; i != -1 ; i = reader.read() )
				writer.write( i != ' ' ? i : '_' );
		}
		catch ( IOException e ) {
			System.out.printf( "Error: Failed to copy file '%s' to '%s'%n%s%n", FILE, COPY, e.getMessage() );
		}
	}
}
