
package com.trythis;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JoinThreads {

	public static void main( String[] args ) {
		System.out.println( "Main thread starting." );

		List<Thread> threads = IntStream.range( 0, 3 ).mapToObj( MyThread.create ).collect( Collectors.toList() );
		threads.stream().forEach( t -> {
			try {
				t.join();
				System.out.printf( "%s joined.%n", t.getName() );
			}
			catch ( InterruptedException e ) {
				System.out.println( "Main thread interrupted." );
			}
		} );
		System.out.println( "Main thread terminating." );
	}

}
