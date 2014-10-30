package mcm.chapter1;

/**
 * First Java exercise in the Java A Beginner's Guide Chapter 1 Converts gallons to litres Slightly
 * over engineered - just for fun
 * 
 * @author Malcolm.Murray
 *
 */
public class GalToLit {

	private final double galToLitRatio = 3.7854; //Constant for the ratio of gallons to litres
	/**
	 * Method to convert gallons to litres
	 * 
	 * @param gallons
	 * @return gallons converted to litres
	 */
	public double convertGalToLit( double gallons ) {
		double litres = gallons * this.galToLitRatio;
		
		return litres;
	}


	/**
	 * Use this to run the program and get some output
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		int noGallons = 10;
		
		GalToLit galToLit = new GalToLit();
		System.out.println( noGallons + " gallons is " + galToLit.convertGalToLit( noGallons ) + " litres." );
	}

}
