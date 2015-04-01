package exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
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
		try {
			BufferedReader fileReader = new BufferedReader( new FileReader( file ) );
			
			List<String> obfuscatedLine = fileReader.lines()
			    .skip( 1 )
			    .map( obfuscateLine )
			    .collect( Collectors.toList() );

			obfuscated = obfuscatedLine.toString();
		}
		catch ( FileNotFoundException fnf ) {
			System.out.println( "Error: Specified File Not Found...." );
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

	private static Function<String, String> obfuscateLine = ( line ) -> {
		//Split line by pipe chars
		String[] cols = line.split( "\\|" );
		StringBuilder newLine = new StringBuilder();
		System.out.println( "Cols: " + Arrays.toString( cols ) );

		for ( int i = 0 ; i < newLine.length() ; i++ ) {
			newLine.append( " | " );
			//			if(i == 4){
			//				newLine.append( cols[i].replaceFirst( "\\d{6}", "######" ) );
			//			}
			//			else {
			//				newLine.append( cols[i] );
			//			}
			newLine.append( cols[i] );
		}

		return newLine.toString();
	};

}
