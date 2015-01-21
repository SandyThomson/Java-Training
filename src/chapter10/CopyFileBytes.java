package chapter10;

import java.io.*;

public class CopyFileBytes {
  
  public static void main ( String[] args ) {
  
    FileInputStream input = null;
    FileOutputStream output = null;
    int i;

    try {
      input = new FileInputStream( "input.txt" );
      output = new FileOutputStream( "output.txt" );

      do {
        i = input.read();
        if ( i != -1 ) {
          if ( (char) i == ' ' ) {
              i = '-';
          }
          System.out.print( (char) i );
          output.write( i );
        }
      } while ( i != -1 );
    
    } catch ( FileNotFoundException e ) {
      System.out.println( "File not found: " + e.toString() );
      
    } catch ( IOException e ) {
      System.out.println( "The IO Broke: " + e.toString() );
      
    } finally {
      
      try {
        if ( input != null ) input.close();
        if ( output != null ) output.close();
      } catch ( IOException e ) {
        System.out.println( "Failed to close a file: " + e.toString() );
      }
    }
  
  }

}
