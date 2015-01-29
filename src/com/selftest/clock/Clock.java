
package com.selftest.clock;

public class Clock {

	private enum State {
		TICKED ("tick "),
		TOCKED ("tock\n");

		private State( String name ) {
			this.name = name;
		}

		public void run() {
			try {
				Thread.sleep( 500 );
			}
			catch ( InterruptedException e ) {
			}
			System.out.printf( "%s", name );
		}

		private final String name;
	}

	State state;

	public synchronized void process( State s, boolean running ) {
		state = s;
		if ( !running ) {
			notify();
		}
		else {
			state.run();

			notify();
			try {
				while ( state == s )
					wait();
			}
			catch ( InterruptedException e ) {
				System.out.printf( "Thread '%s' interrupted.%n", Thread.currentThread().getName() );
			}
		}
	}

	public synchronized void tick( boolean running ) {
		process( State.TICKED, running );
	}

	public synchronized void tock( boolean running ) {
		process( State.TOCKED, running );
	}
}
