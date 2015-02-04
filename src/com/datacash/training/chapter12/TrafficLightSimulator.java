
package com.datacash.training.chapter12;

public class TrafficLightSimulator implements Runnable {

	private Thread thrd;
	private TrafficLightColour colour;
	private boolean stop = false;
	private boolean changed = false;

	public TrafficLightSimulator( TrafficLightColour init ) {
		this.colour = init;

		thrd = new Thread( this );
		thrd.start();
	}

	@Override
	public void run() {
		while ( !stop ) {
			try {
				Thread.sleep( colour.getDelay() );
			}
			catch ( InterruptedException ie ) {
				System.out.println( ie );
			}
			changeColour();
		}

	}

	private synchronized void changeColour() {
		colour = TrafficLightColour.next( colour );

		changed = true;
		notify();
	}

	public synchronized void waitForChange() {
		try {
			while ( !changed ) {
				wait();
			}
			changed = false;
		}
		catch ( InterruptedException ie ) {
			System.out.println( ie );
		}
	}

	public synchronized TrafficLightColour getColour() {
		return colour;
	}

	public synchronized void cancel() {
		stop = true;
	}
}
