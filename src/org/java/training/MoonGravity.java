package org.java.training;

public class MoonGravity {

	public static final double MOON_GRAVITY_RATIO = 0.17;

	public static void main(String[] args) {
		double kilos = 70.0;

		System.out.println( String.format(
				"My weight of %.2fkg on earth is %.2fkg on the moon.", kilos, kilos * MOON_GRAVITY_RATIO ));
	}

}
