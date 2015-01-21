
package com.datacash.training.chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question7 {

	private static final String INPUT_FILE_NAME = "src/com/datacash/training/chapter10/input.txt";
	private static final String OUTPUT_FILE_NAME = "src/com/datacash/training/chapter10/output.txt";

	public static void main( String[] args ) {
		FileInputStream inputFile = null;
		FileOutputStream outputFile = null;
		try {
			inputFile = new FileInputStream( INPUT_FILE_NAME );

			List<Integer> output = new ArrayList<Integer>();

			int out = inputFile.read();

			while ( out != -1 ) {
				if ( (char) out == ' ' ) {
					out = '-';
				}
				output.add( out );
				out = inputFile.read();
			}

			System.out.println( "File contents (byte):" );
			output.stream().map( i -> { return i.byteValue(); } ).forEach( System.out::print );
			System.out.println();

			outputFile = new FileOutputStream( OUTPUT_FILE_NAME );
			// Why doesn't this work? Because forEach doesn't provide exception handling!
			//output.stream().forEach( outputFile::write );
			for ( Integer i : output ) {
				outputFile.write( i );
			}

		}
		catch ( IOException ioe ) {
			System.out.println( "IO takeo Exception too thato!" );
		}
		finally {
			try {
				inputFile.close();
				outputFile.close();
			}
			catch ( IOException e ) {
				System.out.println( "Can't close" );
			}
		}
	}

}
