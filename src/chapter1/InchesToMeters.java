/**
 * 
 */
package chapter1;

/**
 * @author fitzretsil
 *
 */
public class InchesToMeters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Convertor InchesToMeter = new Convertor(0.0254);
		
		for ( double inches = 1; inches <= 144; inches++ ) {
			String meters = InchesToMeter.convert(inches);
			System.out.println( inches + " inch(es) is " + meters + "meters" );
			if ( inches % 12 == 0 ) System.out.println();
		}

	}

}
