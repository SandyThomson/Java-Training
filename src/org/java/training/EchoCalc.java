package org.java.training;

/**
 * From try-it 2-1 'challenge'
 *
 */
public class EchoCalc {

	/**
	 * The speed of sound in a medium at 0C
	 */
	public enum Medium {
		AIR(1_087.2703),
		WATER(4_599.7375);
		
		private final double feetPerSecond;

		private Medium( double fps ) {
			this.feetPerSecond = fps;
		}
		
		public double echoDistance( double secs ) {
			return ( secs * feetPerSecond ) / 2.d;
		}
	}

	public static void main(String[] args) {
		double secs = 7.2d;
		
		System.out.println( String.format(
			"Distance from wall is %.2f feet for a round-trip of %.2f seconds.",
			Medium.AIR.echoDistance(secs), secs ));
	}
}
