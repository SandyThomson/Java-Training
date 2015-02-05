package main.java.traffic;

//A computerised traffic light. 
class TrafficLightSimulator implements Runnable {
	private Thread thrd; // holds the thread that runs the simulation
	private TrafficLightColour tlc; // holds the current traffic light color
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
				Thread.sleep(tlc.getDelay());
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
			tlc = TrafficLightColour.RED_YELLOW;
			break;
		case YELLOW:
			tlc = TrafficLightColour.RED;
			break;
		case GREEN:
			tlc = TrafficLightColour.YELLOW;
			break;
		case RED_YELLOW:
			tlc = TrafficLightColour.GREEN;
			break;
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

