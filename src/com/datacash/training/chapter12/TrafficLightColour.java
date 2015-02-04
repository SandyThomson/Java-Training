
package com.datacash.training.chapter12;

public enum TrafficLightColour {
	RED (12000), GREEN (10000), YELLOW (2000);

	private int delay;

	private TrafficLightColour( int delay ) {
		this.delay = delay;
	}

	public int getDelay() {
		return delay;
	}
	
	public static TrafficLightColour next( TrafficLightColour current ) {
		return TrafficLightColour.values()[ ( current.ordinal() + 1 ) % TrafficLightColour.values().length ];
	}
	
}
