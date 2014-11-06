import java.util.*;

class PrimeCalculator {
  private int start;
  private int end;

  public PrimeCalculator( int start, int end ) {
    this.start = start;
	this.end = end;
  }

  public List<Integer> calculatePrimes() {
    ArrayList<Integer> primes = new ArrayList<Integer>();
	for( int i = start; i <= end; i++ ) {
	  if ( i < 2 ) {
	    continue;
      }
      boolean prime = true;
	  for ( int j = 2; j <= ( i / 2 ); j++ ) {
	    if ( i % j == 0 ) {
		  prime = false;
		  break;
		}
	  }
	  if ( prime ) {
	    primes.add( i );
	  }
	}
	return primes;
  }

  public static void main( String[] args ) {
    int start = ( args.length > 0 ? Integer.parseInt( args[0] ) : 2 );
	  int end = ( args.length > 1 ? Integer.parseInt( args[1] ) : 100 );
	  PrimeCalculator calc = new PrimeCalculator( start, end );
	  List<Integer> primes = calc.calculatePrimes();
	  System.out.println( "The prime numbers between " + start + " and " + end + " are:" );
	  for( int prime : primes ) {
	    System.out.println( prime );
	  }
  }
}
