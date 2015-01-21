
package com.selftest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.Closeable;

public class QuestionSeven {

	private static final String FILE = "src/com/selftest/file.txt";
	private static final String COPY = String.format( "%s.txt", QuestionSeven.class.getSimpleName() );

	public static void main( String[] args ) {
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream( FILE );
			output = new FileOutputStream( COPY );

			for ( int i = input.read() ; i != -1 ; i = input.read() )
				output.write( i != ' ' ? i : '_' );
		}
		catch ( IOException e ) {
			System.out.printf( "Error: Failed to copy file '%s' to '%s'%n%s%n", FILE, COPY, e.getMessage() );
		}
		finally {
			close( input );
			close( output );
		}
	}

	private static void close( Closeable stream ) {
		try {
			if ( stream != null )
			  stream.close();
		}
		catch ( IOException e ) {
			System.err.printf( "Error: Failed to close stream%n%s%n", e.getMessage() );
		}
	}
}
