/*
 * Generate some powers of two with a for loop
 */

public class PowersOfTwo {
  
  public static void main ( String[] args ) {
    
    for ( int i = 1; i <= 1024; i += i ) {
      System.out.println( i );
    }
  }

}
