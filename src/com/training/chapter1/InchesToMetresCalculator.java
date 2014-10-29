
package com.training.chapter1;

import java.util.function.IntConsumer;

public class InchesToMetresCalculator implements IntConsumer {

	// The ratio of inches per metre
	private static final double INCHES_TO_METRES_RATIO = 39.37;

	@Override
	public void accept( int arg0 ) {

		System.out.println( arg0 + " inches is " + arg0 * INCHES_TO_METRES_RATIO + " metres" ); // Output result

		if ( arg0 % 12 == 0 ) {
			System.out.println(); // Output blank line every 10 lines
		}

	}

}
