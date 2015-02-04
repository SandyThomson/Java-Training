
package chapter11;

class TickTock {

	String state; // contains the state of the clock

	synchronized void tick( boolean running ) {
		if ( !running ) { // stop the clock 
			state = "ticked";
			notify(); // notify any waiting threads 
			return;
		}

		try {
			Thread.sleep( 500 );
		}
		catch ( InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print( "Tick " );

		state = "ticked"; // set the current state to ticked

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

		try {
			Thread.sleep( 500 );
		}
		catch ( InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "Tock" );

		state = "tocked"; // set the current state to tocked

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
