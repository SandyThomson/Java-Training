package com.selftest.trafficlight;

import org.junit.Test;

public class TrafficLightSimulatorTest {

	/**
	 * This doesn't _actually_ assert anything - I just hate using main();
	 */
	@Test
	public void testTrafficLight() {
		TrafficLightSimulator ts = new TrafficLightSimulator(
				TrafficLightColour.RED);

		for (int i = 0; i < 9; i++) {
			System.out.println(ts.getColour());
			ts.waitForChange();

		}
		ts.cancel();
	}

}
