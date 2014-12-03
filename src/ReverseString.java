/* 
 * recursively reverse a string
 */

public class ReverseString {
  
  public static void main ( String[] args ) {
    
    reverseString( "Some string" );
    System.out.println();
  }
  
  static void reverseString ( String s ) {
    
    if ( s.length() > 1 ) {
      reverseString( s.substring( 1, s.length() ) );
    }
    System.out.print( s.substring( 0, 1 ) );
  }

}
