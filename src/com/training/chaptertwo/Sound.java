
package com.training.chaptertwo;

import java.util.Arrays;

public class Sound {

	private enum Speed {

		METRIC (340.29, " metres"),
		IMPERIAL (1100, " feet");

		private final double value;
		private final String units;

		private Speed( double value, String units ) {
			this.units = units;
			this.value = value;
		}

		public String getUnits() {
			return this.units;
		}

		public double getValue() {
			return this.value;
		}

	}

	public static void main( String[] args ) {

		print( 7.2, Speed.METRIC );
		print( 7.2, Speed.IMPERIAL );

	}

	private static void print( double time, Speed speed ) {

		Arrays.asList( new String[]{
		    "If the thunder comes after ",
		    Double.toString( time ),
		    " seconds, the lightning was ",
		    Double.toString( time * speed.getValue() ),
		    speed.getUnits(),
		    " away!\n" } ).stream().forEach( System.out::print );

	}

}
