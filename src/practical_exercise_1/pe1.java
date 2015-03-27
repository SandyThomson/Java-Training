package practical_exercise_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class pe1 {

	public static void main(String [] args)
	{
		String input = "./src/practical_exercise_1/customer-data";
		// p: maps to my home dir on edioffserv so matches ~
		String output = "p:/cust-db/sanitised/clean-customer-data";
		
		// try with resources, no need for close statements
		try (BufferedReader br = new BufferedReader( new FileReader( input ) );
		    FileWriter fw = new FileWriter( output )) {

			String strLine;
			boolean header = true;

			//Read File Line By Line
			while ( (strLine = br.readLine()) != null ) {
				List<String> splitLine = Arrays.asList( strLine.split( "\\|" ) );

				if ( header == false ) { // if not header line, anonymize data
					String cardNum = splitLine.get( 3 );
					splitLine.set( 3, cardNum.substring( 0, 6 ) + cardNum.substring( 6 ).replaceAll( ".", "#" ) );
					splitLine.set( 4, splitLine.get( 4 ).replaceAll( ".", "#" ) );
				}

				writeLine( fw, splitLine );

				header = false;
			}

		}
		catch ( IOException e ) {
			System.out.println( "exception caught: " + e );
			e.printStackTrace();
		}
		finally {
			// do nothing
		}
		
	}

	private static void writeLine( FileWriter fw, List<String> splitLine ) throws IOException {
		int size = splitLine.size();

		for ( int i = 0 ; i < size ; i++ ) {
			if ( i == 5 ) {
				// do nothing, cv2 column removal
			}
			else if ( i == size - 1 ) { // last entry
				fw.write( splitLine.get( i ) + "\n" );
			}
			else {
				fw.write( splitLine.get( i ) + "|" );
			}
		}
	}
}
