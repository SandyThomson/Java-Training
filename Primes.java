/*
 * Compute all of the prime numbers between 2 and 100
 *
 */
class Primes {
	public static void main( String[] args ) {
		long i, j;
		boolean isPrime;
		
		for ( i = 2; i <= 100; i++ ) {
			// assume it's prime first of all
			isPrime = true;
			
			// now try to divide by everything between 2 and i/2
			for ( j = 2; j <= i/2; j++ ) {
				if ( i % j == 0 ) {
					// no remainder - we found a divisor. Unset the flag and exit the loop
					isPrime = false;
					break;
				}
			}
			if ( isPrime ) {
				System.out.println( i + " is prime" );
			}
		}
	}
}
