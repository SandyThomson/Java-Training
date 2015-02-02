
package com.selftest;

import java.util.Arrays;

public class ValuesDemo {

	private enum Tools {
		SCREWDRIVER, WRENCH, HAMMER, PLIERS
	}

	public static void main( String[] args ) {
		Arrays.stream( Tools.values() )
		      .map( v -> String.format( "%d: %s", v.ordinal(), v ) )
		      .forEach( System.out::println );
	}
}
