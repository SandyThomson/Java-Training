
package com.datacash.training.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		try (Stream<String> reader = Files.lines( Paths.get( args[0] ) );) {

			System.out.println( "Processing file " + args[0] );

			Files.write( Paths.get( args[1] ), reader.map( CleanCustomerData::cleanRow ).collect( Collectors.toList() ) );
			
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
