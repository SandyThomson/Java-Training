
package com.selftest;

import java.util.stream.IntStream;
import com.selftest.trafficlight.TrafficLight;

public class TrafficLightDemo {

	public static void main( String[] args ) {
		TrafficLight lights = new TrafficLight( TrafficLight.Colour.GREEN );
		IntStream.range( 0, 9 )
		         .forEach( i -> lights.waitForChange() );
		lights.stop();
	}

}
