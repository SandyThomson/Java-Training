
package com.datacash.training.exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

import org.apache.commons.lang.StringUtils;

public class CleanCustomerData {

	/*
	 * Build up the list of behaviours you want to enact on the file.
	 */
	private static List<UnaryOperator<List<String>>> behaviours = new ArrayList<UnaryOperator<List<String>>>();
	static {
		// Remove CV2
		behaviours.add( c -> {
			c.remove( 5 );
			return c;
		} );
		// Obscure expiry
		behaviours.add( c -> {
			c.set( 4, c.get( 4 ).replaceAll( "\\d+\\/\\d+", "#####" ) );
			return c;
		} );
		// Obscure PAN
		behaviours.add( c -> {
			c.set( 3, c.get( 3 ).substring( 0, 6 )
			    + c.get( 3 ).substring( 6, c.get( 3 ).length() )
			        .replaceAll( "\\d", "#" ) );
			return c;
		} );
	}

	public static void main( String[] args ) {

		String inputLine;

		try (BufferedReader reader = new BufferedReader( new FileReader( args[0] ) );
		    BufferedWriter writer = new BufferedWriter( new FileWriter( args[1] ) );) {

			System.out.println( "Processing file " + args[0] );

			while ( (inputLine = reader.readLine()) != null ) {
				writer.write( cleanRow( inputLine ) );
				writer.newLine();
			}

			System.out.println( "Successfully output file to " + args[1] );

		}
		catch ( IOException e ) {
			System.out.println( "IO failure!" );
		}
	}

	public static String cleanRow( String input ) {

		List<String> columns = new LinkedList<String>( Arrays.asList( input.split( "\\|" ) ) );

		for ( UnaryOperator<List<String>> operator : behaviours ) {
			columns = operator.apply( columns );
		}

		return StringUtils.join( columns, "|" );
	}
}
