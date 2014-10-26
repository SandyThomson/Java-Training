package com.selftest.planetweight;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.selftest.planetweight.planets.Moon;
import com.selftest.planetweight.planets.Sun;

public class GravityCalculatorTest {

	@Test
	public void testGerRemotePlanetWeightKilos() {
		GravityCalculator calc = new GravityCalculator();

		double earthWeightKilos = 75;
		calc.setEarthWeightKilos(earthWeightKilos);

		calc.setPlanet(new Moon());

		double moonWeight = calc.getRemotePlanetWeightKilos();
		double expectedMoonWeight = 75 * .17;

		// Is there a non-deprecated assert statement for primitives? assertTrue is just shit.
		assertTrue("Wrong weight", expectedMoonWeight == moonWeight);
		
		calc.setPlanet(new Sun());

		double sunWeight = calc.getRemotePlanetWeightKilos();
		double expectedSunWeight = 75 * 27.02;

		assertTrue("Wrong weight", expectedSunWeight == sunWeight); 
	}
}
