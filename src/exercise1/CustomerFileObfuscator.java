package exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Class to obfuscate the demo file of customer details provided for the exercise
 * 
 * @author Malcolm.Murray
 *
 */
public class CustomerFileObfuscator implements FileObfuscator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String obfuscate( File file ) {
		String obfuscated = "";
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader( new FileReader( file ) );
			List<String> obfuscatedLines = obfuscateTableContent( fileReader );

			//List<String> header = getAndProcessHeader( fileReader );

			obfuscated = convertLinesToString( obfuscatedLines );
		}
		catch ( IOException ioe ) {
			System.out.println( "Error: Specified File Not Found...." );
		}
		finally{
			try {
				if ( fileReader != null ) {
					fileReader.close();
				}
			}
			catch ( IOException e ) {
				e.printStackTrace();
			}
		}
		
		
		return obfuscated;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String obfuscate( String filename ) {
		
		return this.obfuscate( new File( filename ) );
	}

	private List<String> obfuscateTableContent( BufferedReader fileReader ) {
		List<String> obfuscatedLines = fileReader.lines()
		    //.skip( 1 )
		    .map( obfuscateLine )
		    .collect( Collectors.toList() );

		return obfuscatedLines;
	}



	private String convertLinesToString( List<String> lines ) {
		//Use a string builder for this as its mutable
		StringBuilder osb = new StringBuilder();
		for ( String s : lines ) {
			osb.append( s )
			    .append( "\n" );
		}

		return osb.toString();
	}

	private static Function<String, String> obfuscateLine = ( line ) -> {
		//Split line by pipe chars
		String[] cols = line.split( "\\|" );
		StringBuilder newLine = new StringBuilder();

		for ( int i = 0 ; i < cols.length ; i++ ) {
			if ( i != 5 ) {
				newLine.append( "|" );
			}
			
			switch (i){
				case 3:
					newLine.append( cols[i].replaceFirst( "\\d{6}", "######" ) );
					break;
					
				case 4:
					newLine.append( cols[i].replaceFirst( "\\dd\\/dd", "##/##" ) );
					break;
				case 5:
					//Do nothing as we don't want this column
					break;
				default:
					newLine.append( cols[i] );
					break;
			}
		}

		return newLine.toString();
	};

	@Override
	public void saveObfuscatedFile( String filename ) {
		// TODO Auto-generated method stub

	}
}
