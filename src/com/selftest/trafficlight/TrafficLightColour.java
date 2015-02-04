package com.selftest.trafficlight;

public enum TrafficLightColour {
	RED(1), GREEN(1), AMBER(1);

	private int sleepMillis;

	private TrafficLightColour(int delaySeconds) {
		this.sleepMillis = delaySeconds * 1000;

	}

	public int getSleepMillis() {
		return sleepMillis;
	}

}
