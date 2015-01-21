
package com.datacash.training.chapter10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question8 {

	private static final String INPUT_FILE_NAME = "src/com/datacash/training/chapter10/input2.txt";
	private static final String OUTPUT_FILE_NAME = "src/com/datacash/training/chapter10/output2.txt";

	public static void main( String[] args ) {
		try (FileReader inputFile = new FileReader( INPUT_FILE_NAME );
		    FileWriter outputFile = new FileWriter( OUTPUT_FILE_NAME );)
		{

			List<Integer> output = new ArrayList<Integer>();

			int out = inputFile.read();

			while ( out != -1 ) {
				if ( (char) out == ' ' ) {
					out = '-';
				}
				output.add( out );
				out = inputFile.read();
			}

			System.out.println( "File contents (character):" );
			output.stream().map( i -> { return (char) i.intValue(); } ).forEach( System.out::print );
			System.out.println();

			for ( Integer i : output ) {
				outputFile.write( i );
			}

		}
		catch ( IOException ioe ) {
			System.out.println( "IO takeo Exception too thato!" );
		}
	}

}
