package ch11;


// Use wait() and notify() to create a ticking clock.

class TickTock {

	String state; // contains the state of the clock

	synchronized void tick( boolean running ) {
		if ( !running ) { // stop the clock 
			state = "ticked";
			notify(); // notify any waiting threads 
			return;
		}

		System.out.print( "Tick " );

		state = "ticked"; // set the current state to ticked

		try {
			Thread.sleep( 500 );
		}
		catch ( InterruptedException e ) {
			System.out.println( "Sleep interrupted." );
			e.printStackTrace();
		}

		notify(); // let tock() run 
		try {
			while ( !state.equals( "tocked" ) )
				wait(); // wait for tock() to complete 
		}
		catch ( InterruptedException exc ) {
			System.out.println( "Thread interrupted." );
		}
	}

	synchronized void tock( boolean running ) {
		if ( !running ) { // stop the clock 
			state = "tocked";
			notify(); // notify any waiting threads 
			return;
		}

		System.out.println( "Tock" );

		state = "tocked"; // set the current state to tocked
		try {
			Thread.sleep( 500 );
		}
		catch ( InterruptedException e ) {
			System.out.println( "Sleep interrupted." );
			e.printStackTrace();
		}

		notify(); // let tick() run 
		try {
			while ( !state.equals( "ticked" ) )
				wait(); // wait for tick to complete 
		}
		catch ( InterruptedException exc ) {
			System.out.println( "Thread interrupted." );
		}
	}
}

