
package com.trythis.comparefiles;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFiles {

	public static final String IGNORE_CASE = "-i";

	public static void main( String[] args ) {
		if ( args.length < 2 ||
		     args.length > 3 && args[0].equals( IGNORE_CASE ) )
		  usage();

		boolean ignoreCase = args.length == 3;
		try (FileInputStream lhs = new FileInputStream( args[ignoreCase ? 1 : 0] );
		     FileInputStream rhs = new FileInputStream( args[ignoreCase ? 2 : 1] )) {
			int i = 0, j = 0;
			while ( (i = lhs.read()) != -1 &
							(j = rhs.read()) != -1 &&
			    equals( i, j, ignoreCase ) );
			System.out.printf( "Files are %s.%n", equals( i, j, ignoreCase ) ? "the same" : "different" );
		}
		catch ( IOException e ) {
			System.out.println( e.getMessage() );
		}
	}

	public static boolean equals( int i, int j, boolean ignoreCase ) {
		return ignoreCase ? Character.toLowerCase( i ) == Character.toLowerCase( j ) : i == j;
	}

	public static void usage() {
		System.out.printf( "Usage: %s [-i] <file> <file>\nWhere:\n '-i' = Ignore Case.", CompareFiles.class.getSimpleName() );
		System.exit( 0 );
	}
}
