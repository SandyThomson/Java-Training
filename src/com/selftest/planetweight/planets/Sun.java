package com.selftest.planetweight.planets;

public class Sun implements Planet {

	private final static double GRAVITY_FACTOR = 27.02;

	@Override
	public double getGravityFactor() {
		return GRAVITY_FACTOR;
	}

}
