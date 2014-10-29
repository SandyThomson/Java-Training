/*
 * Calculate one's effective weight on the moon
 */
class WeightOnMoon {
	
	public static void main( String args[] ) {
		
		final double RELATIVE_GRAVITY = 0.17;
		
		double myWeightOnEarth = 83.0;
		double myWeightOnMoon;
		
		myWeightOnMoon = myWeightOnEarth * RELATIVE_GRAVITY;
		
		System.out.println( "On Earth, you weigh " + myWeightOnEarth + "kg." );
		System.out.println( "On the moon, you effectively weigh " + myWeightOnMoon + "kg." );
	}
}
