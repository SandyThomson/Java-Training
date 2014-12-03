/*
 * Demonstrating varargs
 */

public class Args {
  
  public static void main ( String[] args ) {
    
    int[] array = { 1, 2, 3, 4, 5 };
    
    System.out.println( sum( array ) );
  }
  
  static int sum ( int ... array ) {
    
    int sum = 0;
    
    for ( int i : array ) sum += i;
  
    return sum;
  }

}
