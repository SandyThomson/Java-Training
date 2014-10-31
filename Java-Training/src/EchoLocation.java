/*
 * Try this 2-1.6
 */

import java.util.concurrent.TimeUnit;

public class EchoLocation {
	
	public static void main ( String[] args ) {
		double dist;
		double speedOfSound = 340.29; // metres per second
		
		double echoTime = Math.random() * 10; // Some random echo time
		
		dist = speedOfSound * ( echoTime / 2 );
		
		System.out.println( "The object is " + dist + " metres away.");

	}

}
