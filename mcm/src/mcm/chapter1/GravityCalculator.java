package mcm.chapter1;

import java.text.DecimalFormat;

/**
 * Question 10 in the Java A Beginner's Guide Chapter 1 Calculates effective weight on the moon.
 * 
 * @author Malcolm.Murray
 *
 */
public class GravityCalculator {

	private double gravityFactor; //The gravity factor to be used
	private MeasurementConverter converter; //The measurement converter to use
	
	/**
	 * Constructor to setup the Gravity Calculator
	 * 
	 * @param defaultFactor
	 */
	public GravityCalculator( double defaultFactor ) {
		setGravityFactor( defaultFactor );
		
		//Setup the measurement converter
		this.converter = new MeasurementConverter();
	}

	/**
	 * Method to convert kilos to effective gravity weight in kilos
	 * 
	 * @param weightKilos
	 * @return effective weight in kilos
	 */
	public double calculateEffectiveWeighKilos( double weightKilos ) {
		
		return converter.convert( weightKilos, getGravityFactor() );
	}

	public double calculateEffectiveWeightLbs( double weightLbs ) {
		return converter.convert( weightLbs, gravityFactor );
	}


	/**
	 * Getter for Gravity Factor
	 * 
	 * @return
	 */
	public double getGravityFactor() {
		return gravityFactor;
	}

	/**
	 * Setter for Gravity Factor
	 * 
	 * @param gravityFactor
	 */
	public void setGravityFactor( double gravityFactor ) {
		this.gravityFactor = gravityFactor;
	}

	/**
	 * Use this to run the program and get some output Runs with the gravity factor of the moon, but
	 * can be anything
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		double moonGravity = 0.17; //The moon's gravity is 17% of earth's

		//Setup the GravityCalculator
		GravityCalculator gravityCalc = new GravityCalculator( moonGravity );

		//Setup a Decimal Formatter so we only get 2 dec places, otherwise we get a lot.
		DecimalFormat df = new DecimalFormat( "#.00" );

		//Test weight in kilos
		double weightInKilos = 80.00;
		System.out.println( weightInKilos + " kg is effectively " + df.format( gravityCalc.calculateEffectiveWeighKilos( weightInKilos ) ) + "kg on the Moon." );

		double weightInLbs = 176.37;
		System.out.println( weightInLbs + " lbs is effectively " + df.format( gravityCalc.calculateEffectiveWeightLbs( weightInLbs ) ) + "lbs on the Moon." );

	}

}
