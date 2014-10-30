package mcm.chapter1;

/**
 * First Java exercise in the Java A Beginner's Guide Chapter 1 Converts specified units between one and another
 * over engineered - just for fun
 * 
 * @author Malcolm.Murray
 *
 */
public class MeasurementConverter {

	public static final double GALTOLITRERATIO = 3.7854; //Constant for the ratio of gallons to litres
	public static final double INCHTOMETRERATIO = 0.0254; //Constant for Ratio of inches to metres
	
	/**
	 * Method to return a ratio applied to a value
	 * Handy hint: use the the public constants for ratios!
	 * @param value
	 * @param ratio
	 * @return the result of the ratio applied to the value
	 */
	public double convert( double value, double ratio ) {		
		return value * ratio;
	}
	
	

	/**
	 * Use this to run the program and get some output
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		int noGallons = 10;
		
		MeasurementConverter galToLit = new MeasurementConverter();
		System.out.println( noGallons + " gallons is " + galToLit.convert( noGallons, MeasurementConverter.GALTOLITRERATIO ) + " litres." );
	}

}
