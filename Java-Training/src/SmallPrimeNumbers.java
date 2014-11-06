

public class SmallPrimeNumbers {
  
  public static void main ( String[] args ) {
    
    for ( int number = 2 ; number <= 100 ; number++ ) {
      int divisor_count = 0;
      
      for ( int divisor = 2 ; divisor <= ( number / 2 ) ; divisor++ ) {
        if ( number % divisor == 0 ) {
          divisor_count++;
          // Ideally I'd break out of this loop somehow.
        }
      }

      if ( divisor_count == 0 ) {
        System.out.println( number + " is prime");
      }
    }

  }

}
