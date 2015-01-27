
package com.trythis;

import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class MyThread extends Thread {

	MyThread( String name ) {
		super( name );
		start();
	}

	@Override
	public void run() {
		System.out.printf( "%s starting.%n", getName() );

		IntStream.range( 0, 10 ).forEach( count -> {
			try {
				Thread.sleep( 400 );
				System.out.printf( "%s: count is %d.%n", getName(), count );
			}
			catch ( InterruptedException e ) {
				System.out.printf( "%s interrupted.%n", getName() );
			}
		} );
		System.out.printf( "%s terminating.%n", getName() );
	}

	public static IntFunction<Thread> create = i -> {
		return new MyThread( String.format( "Child #%d", i ) );
	};
}
