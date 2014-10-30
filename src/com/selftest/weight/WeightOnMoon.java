package com.selftest.weight;

public class WeightOnMoon {

	private static final double MOON_GRAVITY_PERCENTAGE = 0.17;
	
	public static void main( String[] args ) {
		int weight_on_earth = 74;
		System.out.println( String.format( "Weight on the Moon is %.2f kg.", (weight_on_earth * MOON_GRAVITY_PERCENTAGE) ) );
	}
	
}
