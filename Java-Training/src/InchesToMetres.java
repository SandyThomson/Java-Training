


public class InchesToMetres {
	
	public static void main( String[] args ) {
		
		double inches, metres;
		int counter = 0;
		
		for ( inches = 1; inches <= 144; inches++ ) {
			metres = inches / 39.37;
			System.out.println( inches + " inches is " + metres + " metres.");
		
      counter++;
      if ( counter == 12 ) {
        System.out.println();
        counter = 0;
      }
		}
	}
}
