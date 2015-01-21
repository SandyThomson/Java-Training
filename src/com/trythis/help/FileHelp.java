
package com.trythis.help;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Help {

	private static final String FILE = "src/com/trythis/help/help.txt";

	public static boolean helpOn( String what ) {
		try (BufferedReader reader = new BufferedReader( new FileReader( FILE ) )) {
			String line;
			while ( (line = reader.readLine()) != null ) {
				if ( line.equalsIgnoreCase( String.format( "#%s", what ) ) ) {
					for ( line = reader.readLine() ; (line != null && !line.contains( "#" )) ; line = reader.readLine() )
						System.out.println( line );
					return true;
				}
			}
		}
		catch ( IOException e ) {
			System.out.printf( "Error. Failed to access help file '%s'.%n%s%n", FILE, e.getMessage() );
		}
		return false;
	}

	public static String getSelection() {
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.print( "Enter topic: " );
		try {
			return reader.readLine();
		}
		catch ( IOException e ) { 
			System.out.printf( "Error. Failed to read from console.%n%s%n", e.getMessage() );
		}
		return "";
	}
}

public class FileHelp {

	private static final String STOP = "stop";

	public static void main( String[] args ) {
		String topic;
		while ( !STOP.equalsIgnoreCase( (topic = Help.getSelection()) ) ) {
			if ( !Help.helpOn( topic ) )
			  System.out.printf( "Topic '%s' not found.%n", topic );
		}
	}

}
