package com.selftest.trafficlight;

public class TrafficLightSimulator implements Runnable {

	private Thread t;
	private TrafficLightColour tlc;
	boolean stop = false;
	boolean changed = false;

	public TrafficLightSimulator(TrafficLightColour init) {
		tlc = init;

		t = new Thread(this);
		t.start();
	}

	public TrafficLightSimulator() {
		this(TrafficLightColour.RED); // default to RED
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(tlc.getSleepMillis());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			changeColour();
		}
		
	}

	public synchronized void changeColour() {
		// Excuses to use ordinals etc
		tlc = (tlc.ordinal() == 2) ? TrafficLightColour.values()[0]
				: TrafficLightColour.values()[tlc.ordinal() + 1];

		changed = true;
		notify();
	}

	public synchronized void waitForChange() {
		try {
			while (!changed) {
				wait();
			}
			changed = false;
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public synchronized TrafficLightColour getColour() {
		return tlc;
	}

	public synchronized void cancel() {
		stop = true;
	}

}
