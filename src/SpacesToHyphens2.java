import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class SpacesToHyphens2 {

	private String inputFile;
	private String outputFile;

	SpacesToHyphens2( String inputFile, String outputFile ) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}

	public void convert() {
		try (
		    BufferedReader input = new BufferedReader( new FileReader( inputFile ) );
		    BufferedWriter output = new BufferedWriter( new FileWriter( outputFile ) )) {
			do {
				output.write( input.readLine().replaceAll( "\\s", "-" ) );
			}
			while ( input.readLine() != null );
		}
		catch ( IOException e ) {
			System.out.printf( "Failed to copy [%s] into [%s]", inputFile, outputFile );
    }
	}
}
