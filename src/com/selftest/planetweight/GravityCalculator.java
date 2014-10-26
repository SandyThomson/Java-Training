package com.selftest.planetweight;

import com.selftest.planetweight.planets.Planet;

public class GravityCalculator {

	private Planet planet;
	private double earthWeightKilos;

	public Planet getPlanet() {
		return planet;
	}

	public void setPlanet(Planet p) {
		this.planet = p;
	}

	public double getEarthWeightKilos() {
		return earthWeightKilos;
	}

	public void setEarthWeightKilos(double earthWeightKilos) {
		this.earthWeightKilos = earthWeightKilos;
	}

	public double getRemotePlanetWeightKilos() {
		// I'll just allow Java to throw the NPE's etc rather than giving a shit.
		return earthWeightKilos * planet.getGravityFactor();
	}

}
