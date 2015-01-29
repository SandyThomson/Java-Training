
package com.selftest;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.selftest.queue.FixedQueue;
import com.selftest.queue.Queue;

class AddToQueue<T> implements Runnable {

	Queue<T> queue;
	Function<Integer, T> functor;
	int count;
	Thread thread;

	public AddToQueue( Queue<T> queue, Function<Integer, T> functor, int count ) {
		this.queue = queue;
		this.functor = functor;
		this.count = count;

		this.thread = new Thread( this );
		this.thread.start();
	}

	@Override
	public void run() {
		IntStream.range( 0, count ).boxed().map( i -> functor.apply( i ) ).forEach( queue::put );
	}
}

public class QueueDemo {

	private static Function<Character, String> CHARACTER_TOSTRING = c -> (c == null ? "_" : Character.toString( c ));
	private static Function<Integer, Character> CHARACTERS_ASCENDING = i -> (char) ('A' + i);
	private static Function<Integer, Character> CHARACTERS_DESCENDING = i -> (char) ('Z' - i);

	public static void main( String[] args ) {
		Queue<Character> fixed = new FixedQueue<Character>( 26 );
		List<AddToQueue<Character>> threads = Stream.of( CHARACTERS_ASCENDING, CHARACTERS_DESCENDING )
		                                            .map( functor -> new AddToQueue<Character>( fixed, functor, 13 ) )
		                                            .collect( Collectors.toList() );

		threads.forEach( t -> {
			try {
				t.thread.join();
			}
			catch ( InterruptedException e ) {
				System.out.println( "Main thread interrupted." );
			}
		} );
		System.out.printf( "Queue: %s%n", fixed.stream().map( CHARACTER_TOSTRING ).collect( Collectors.joining() ) );
	}
}
