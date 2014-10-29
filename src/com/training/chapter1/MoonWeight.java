
package com.training.chapter1;

import java.util.Arrays;

/**
 * Compute your moon weight
 * 
 * @author spg
 *
 */
public class MoonWeight {

	private static final double MOON_GRAVITY_RATIO = 0.17;

	public static void main( String[] args ) {

		String weight = args[0];

		try {
			Arrays.asList( new String[]{ "If you weigh ", weight, "kg on Earth, you would weigh ", getMoonWeight( Double.parseDouble( weight ) ), "kg on the moon!" } ).stream().forEach( System.out::print );
		}
		catch ( NumberFormatException nfe ) {
			System.out.println( "Argument is not a valid number!" );
		}

	}

	private static String getMoonWeight( double earthWeight ) {
		return Double.toString( earthWeight * MOON_GRAVITY_RATIO );
	}
}
