package chapter12;


enum TrafficLightColor {
	RED (1200), GREEN (1000), YELLOW (2000);

	private int delay = 0;

	TrafficLightColor( int duration ) {
		this.delay = duration;
	}

	public int getDelay() {
		return delay;
	}

	public TrafficLightColor getNext() {
		return values()[(ordinal() + 1) % values().length];
	}
}

// A computerized traffic light. 
class TrafficLightSimulator implements Runnable {

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
	public void run() {
		while ( !stop ) {
			try {
				Thread.sleep( tlc.getDelay() );
			}
			catch ( InterruptedException exc ) {
				System.out.println( exc );
			}
			changeColor();
		}
	}

	// Change color. 
	synchronized void changeColor() {
		tlc = tlc.getNext();
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
