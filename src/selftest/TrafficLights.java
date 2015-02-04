package selftest;

import selftest.TrafficLights.TrafficLightColour;

public class TrafficLights {
	enum TrafficLightColour {
		
		RED(12000), AMBER(5000), GREEN(10000);
		TrafficLightColour( int d ) {
			duration = d;
		}
		private int duration;
		
		int getDuration() {
			return duration;
		}
	}

	public static void main(String args[]) {
		TrafficLightSimulator tl = new TrafficLightSimulator(
				TrafficLightColour.GREEN);
		for (int i = 0; i < 9; i++) {
			System.out.println(tl.getColor());
			tl.waitForChange();
		}
		tl.cancel();
	}
}

class TrafficLightSimulator implements Runnable {
	private Thread thrd; // holds the thread that runs the simulation
	private TrafficLightColour tlc; // holds the traffic light color
	boolean stop = false; // set to true to stop the simulation
	boolean changed = false; // true when the light has changed

	TrafficLightSimulator(TrafficLightColour init) {
		tlc = init;
		thrd = new Thread(this);
		thrd.start();
	}

	TrafficLightSimulator() {
		tlc = TrafficLightColour.RED;
		thrd = new Thread(this);
		thrd.start();
	}

	// Start up the light.
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(tlc.getDuration() );
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}

	// Change color.
	synchronized void changeColor() {
		switch (tlc) {
		case RED:
			tlc = TrafficLightColour.GREEN;
			break;
		case AMBER:
			tlc = TrafficLightColour.RED;
			break;
		case GREEN:
			tlc = TrafficLightColour.AMBER;
		}
		changed = true;
		notify(); // signal that the light has changed
	}

	// Wait until a light change occurs.
	synchronized void waitForChange() {
		try {
			while (!changed)
				wait(); // wait for light to change
			changed = false;
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}

	// Return current color.
	synchronized TrafficLightColour getColor() {
		return tlc;
	}

	// Stop the traffic light.
	synchronized void cancel() {
		stop = true;
	}

}