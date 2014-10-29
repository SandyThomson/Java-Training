/**
 * 
 */
package chapter1;

/**
 * @author fitzretsil
 *
 */
public class GalToLitTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for ( double gallons = 1; gallons <= 30; gallons++ ) {
			double liters = gallons * 3.7854;
			
			System.out.println( gallons + " gallons is " + liters + " liters." );
			if ( gallons % 10 == 0 ) System.out.println();
		}

	}

}
