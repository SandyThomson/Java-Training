// A simulation of a traffic light that uses
// an enumeration to describe the light's color.

// An enumeration of the colors of a traffic light.
enum TrafficLightColor {
	RED (12), GREEN (10), YELLOW (2);

	private int duration;

	TrafficLightColor( int a ) {
		duration = a * 1000;
	}

	int getDuration() {
		return duration;
	}
}

// A computerized traffic light. 
public class TrafficLightSimulator implements Runnable {

	private Thread thrd; // holds the thread that runs the simulation 
	private TrafficLightColor tlc; // holds the current traffic light color 
	boolean stop = false; // set to true to stop the simulation 
	boolean changed = false; // true when the light has changed

	TrafficLightSimulator( TrafficLightColor init ) {
		tlc = init;

		thrd = new Thread( this );
		thrd.start();
	}

	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;

		thrd = new Thread( this );
		thrd.start();
	}

	// Start up the light. 
	@Override
	public void run() {
		while ( !stop ) {
			try {
				// duration now part of enum, so can call this no matter what the value
				Thread.sleep( tlc.getDuration() );
			}
			catch ( InterruptedException exc ) {
				System.out.println( exc );
			}
			changeColor();
		}
	}

	// Change color. 
	synchronized void changeColor() {
		// get the values, then add one, rolling over if necessary
		TrafficLightColor[] values = TrafficLightColor.values();
		tlc = values[(tlc.ordinal() + 1) % values.length];

		changed = true;
		notify(); // signal that the light has changed 
	}

	// Wait until a light change occurs. 
	synchronized void waitForChange() {
		try {
			while ( !changed )
				wait(); // wait for light to change 
			changed = false;
		}
		catch ( InterruptedException exc ) {
			System.out.println( exc );
		}
	}

	// Return current color. 
	synchronized TrafficLightColor getColor() {
		return tlc;
	}

	// Stop the traffic light. 
	synchronized void cancel() {
		stop = true;
	}
}

class TrafficLightDemo {

	public static void main( String args[] ) {
		TrafficLightSimulator tl =
		    new TrafficLightSimulator( TrafficLightColor.GREEN );

		for ( int i = 0 ; i < 9 ; i++ ) {
			System.out.println( tl.getColor() );
			tl.waitForChange();
		}

		tl.cancel();
	}
}


