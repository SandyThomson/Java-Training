/**
 * 
 */
package chapter1;

/**
 * @author fitzretsil
 *
 */
public class GallonsToLitres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if ( args == null || args.length == 0 ) {
			System.out.println( "Please provide one value to convert to convert, or two values to convert a range" );
		}
		else if ( args.length == 1 ) {
			convertSingleValue(args[0]);
		}
		else {
			convertRangeOfValues(args[0], args[1]);
		}
		
	}

	private static void convertRangeOfValues(String string, String string2) {
		double start = Double.parseDouble( string );
		double end = Double.parseDouble( string2 );
		
		for ( double gallons = start; gallons <= end; gallons++ ) {
			double liters = gallons * 3.7854;
			
			System.out.println( gallons + " gallons is " + liters + " liters." );
			if ( gallons % 10 == 0 ) System.out.println();
		}
		
	}

	private static void convertSingleValue(String string) {
		double gallons = Double.parseDouble( string );
				
		Convertor GallonsToLitres = new Convertor(3.7854);
		
		String liters = GallonsToLitres.convert(gallons);
		
		System.out.println( gallons + " gallons is " + liters + " liters." );
		
	}

}
