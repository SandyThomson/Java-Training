
package com.trythis;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExtendThread {

	public static void main( String[] args ) {
		System.out.println( "Main thread starting." );

		List<Thread> threads = IntStream.range( 0, 3 ).mapToObj( MyThread.create ).collect( Collectors.toList() );
		do {
			System.out.print( "." );
			try {
				Thread.sleep( 100 );
			}
			catch ( InterruptedException e ) {
				System.out.println( "Main thread interrupted." );
			}
		}
		while ( threads.stream().anyMatch( t -> t.isAlive() ) );
		System.out.println( "Main thread terminating." );
	}

}
