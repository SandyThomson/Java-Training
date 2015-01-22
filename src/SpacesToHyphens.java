import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class SpacesToHyphens {

	private String inputFile;
	private String outputFile;

	SpacesToHyphens( String inputFile, String outputFile ) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}

	public void convert() throws IOException {
		BufferedInputStream input = null;
		BufferedOutputStream output = null;
		try {
			input = new BufferedInputStream( new FileInputStream( inputFile ) );
			output = new BufferedOutputStream( new FileOutputStream( outputFile ) );
			for ( int i = input.read() ; i > 0 ; i = input.read() ) {
				output.write( i == ' ' ? '-' : i );
			}
		}
		catch ( IOException e ) {
			System.out.printf( "Failed to copy [%s] into [%s]", inputFile, outputFile );
    }
		finally {
			if ( input != null ) input.close();
			if ( output != null ) output.close();
		}
	}
}
