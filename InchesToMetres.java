/*
 * Display a conversion table of inches to metres
 *
 */
class InchesToMetres {
	
	public static void main( String args[] ) {
		final double INCHES_IN_METRE = 39.37;
		final double INCHES_IN_FOOT = 12;
		
		int inches;
		double metres;
		
		for( inches = 1; inches <= 12 * INCHES_IN_FOOT; inches++ ) {
			metres = inches / INCHES_IN_METRE;
			System.out.println( inches + " inches == " + metres + " metres." );
			// let's output a new line every 12 rows
			if ( inches % 12 == 0 ) {
				System.out.println();
			}
		}
	}
}
