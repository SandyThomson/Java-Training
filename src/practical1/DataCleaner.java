package practical1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class DataCleaner {

  public static void main ( String args[] ) {
    
    try ( BufferedReader in = new BufferedReader( new FileReader( "customer-data" ) );
          BufferedWriter out = new BufferedWriter( new FileWriter( "cleaned-customer-data" ) )  ) {

      // Get the first line
      String line = in.readLine();
      // Break it to bits
      ArrayList<String> lineParts = new ArrayList<>( Arrays.asList( line.split( "\\|" ) ) );
      lineParts = removeCV2( lineParts );
      out.write( String.join( "|", lineParts ) + "\n" );

      // Loop over the lines in a file
      line = in.readLine();
      while ( line != null ) {
        lineParts = new ArrayList<>( Arrays.asList( line.split( "\\|" ) ) );
        lineParts = removeCV2 ( lineParts );
        lineParts = obscureNumbers ( lineParts );
        out.write( String.join( "|", lineParts ) + "\n" );
        line = in.readLine();
      }
        
    } catch ( IOException e ) {
      System.out.println( "Exception was: " + e.toString() );
    }
  }
  
  static ArrayList<String> removeCV2 ( ArrayList<String> lineParts ) {
    
    // Remove the CV2
    lineParts.remove( 5 );
    return lineParts;
  }

  static ArrayList<String> obscureNumbers ( ArrayList<String> lineParts ) {
    
    // Hide the card no
    StringBuilder obscuredPan = new StringBuilder( lineParts.get(3).substring( 0, 6 ) );
    for ( int i = 0; i <= lineParts.get(3).substring( 7 ).length(); i++ ) {
      obscuredPan.append('#');
    }
    lineParts.set( 3, obscuredPan.toString() );
    
    // Expiry
    // Totally regexing it up
    String expiry = lineParts.get( 4 );
    lineParts.set( 4, expiry.replaceAll( "[0-9/]", "#" ) );

    return lineParts;
  }
}
