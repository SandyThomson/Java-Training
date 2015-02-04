
package com.datacash.training.chapter12;

public class Question4 {

	public static void main( String[] args ) {
		TrafficLightSimulator tlSim = new TrafficLightSimulator( TrafficLightColour.GREEN );

		for ( int i = 0 ; i < 9 ; i++ ) {
			System.out.println( tlSim.getColour() );
			tlSim.waitForChange();
		}
		tlSim.cancel();
	}

}
