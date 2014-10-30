package com.selftest.planetweight.planets;

public class Moon implements Planet {

	private final static double GRAVITY_FACTOR = 0.17;

	@Override
	public double getGravityFactor() {
		return GRAVITY_FACTOR;
	}

}
