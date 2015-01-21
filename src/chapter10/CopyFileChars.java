package chapter10;

import java.io.*;

public class CopyFileChars {
  
  public static void main ( String[] args ) {
  
    int i;

    try ( FileReader input = new FileReader( "input.txt" );
        FileWriter output =new FileWriter( "output.txt" ) ) {

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
      
    } 
  }

}
