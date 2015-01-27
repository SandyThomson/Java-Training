
package com.selftest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.selftest.clock.Clock;

abstract class TimeThread implements Runnable {

	public static String TICK = "Tick";
	public static String TOCK = "Tock";

	Thread thread;
	Clock clock;

	public static TimeThread create( String name, Clock clock ) {
		return (name.equals( TICK ) ? new TickThread( name, clock ) :
		                              new TockThread( name, clock ));
	}

	protected TimeThread( String name, Clock clock ) {
		this.thread = new Thread( this, name );
		this.clock = clock;
		this.thread.start();
	}

	public void run() {
		IntStream.rangeClosed( 0, 5 ).forEach( seconds -> {
			action( seconds < 5 );
		} );
	}

	protected abstract void action( boolean running );
}

class TickThread extends TimeThread {

	public TickThread( String name, Clock clock ) {
		super( name, clock );
	}

	@Override
	protected void action( boolean running ) {
		clock.tick( running );
	}
}

class TockThread extends TimeThread {

	public TockThread( String name, Clock clock ) {
		super( name, clock );
	}

	@Override
	protected void action( boolean running ) {
		clock.tock( running );
	}
}

public class TimeDemo {

	public static void main( String[] args ) {
		Clock clock = new Clock();
		List<TimeThread> threads = Stream.of( TimeThread.TICK, TimeThread.TOCK )
		                                 .map( name -> TimeThread.create( name, clock ) )
		                                 .collect( Collectors.toList() );

		threads.stream().sequential().forEach( t -> {
			try {
				t.thread.join();
			}
			catch ( InterruptedException e ) {
				System.out.println( "Main thread interrupted." );
			}
		} );
	}
}
