
package com.selftest.trafficlight;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TrafficLight implements Runnable {

	public enum Colour {
		RED (TimeUnit.SECONDS.toMillis( 12 )),
		GREEN (TimeUnit.SECONDS.toMillis( 10 )),
		AMBER (TimeUnit.SECONDS.toMillis( 2 ));

		private long delay;

		private Colour( long delay ) {
			this.delay = delay;
		}

		public long delay() {
			return delay;
		}
	}

	private Colour colour;
	private Thread thread;

	private boolean stopped = false;
	private boolean changed = false;

	public TrafficLight( Colour init ) {
		colour = init;
		thread = new Thread( this );
		thread.start();
	}

	public TrafficLight() {
		this( Colour.RED );
	}

	@Override
	public void run() {
		while ( !stopped ) {
			try {
				Thread.sleep( colour.delay() );
			}
			catch ( InterruptedException e ) {
				System.out.println( e );
			}
			change();
		}
	}

	public synchronized void change() {
		colour = Arrays.asList( Colour.values() ).get( (colour.ordinal() + 1) % Colour.values().length );
		changed = true;
		notify();
	}

	public synchronized void waitForChange() {
		try {
			System.out.println( colour );
			while ( !changed )
				wait();
			changed = false;
		}
		catch ( InterruptedException e ) {
			System.out.println( e );
		}
	}

	public synchronized void stop() {
		stopped = true;
	}
}
