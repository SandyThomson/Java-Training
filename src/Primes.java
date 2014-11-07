class Primes {

  public static void main( String... args ) {
    if ( args.length < 2 ) { 
      System.out.println( "Must provide range" );
    }
    else {
      int start = Integer.parseInt( args[0] );
      int end = Integer.parseInt( args[1] );
      StringBuffer sb = new StringBuffer();
      for ( int i = start; i <= end; i++ ){
        if ( Primes.isPrime( i ) ) {
          sb.append( i );
          sb.append( ',' );
        }
      }
      sb.deleteCharAt( sb.length() - 1 );
      System.out.println( sb );
    }
  }

  /*
   * See http://en.wikipedia.org/wiki/Primality_test
   */
  private static boolean isPrime( int number ){
    if ( number <= 3 ) {
      return number > 1;
    }
    else if ( number % 2 == 0 || number % 3 == 0 ) {
      return false;
    } 
    else {
      for ( int i = 5; i * i <= number; i += 6 ) {
        if ( number % i == 0 || number % ( i + 2 ) == 0 ) {
          return false;
        }
      }
      return true;
    }
  }

}
