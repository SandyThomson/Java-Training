
package com.selftest.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public abstract class AbstractQueue<T> implements Queue<T> {

	protected T[] queue;
	protected int putLoc, getLoc;

	@SafeVarargs
	public AbstractQueue( int size, T ... values ) {
		queue = Arrays.copyOf( values, size );
		putLoc = getLoc = 0;
	}

	@Override
	public synchronized Iterator<T> iterator() {
		return Arrays.asList( queue ).iterator();
	}

	@Override
	public synchronized T get() {
		T value = queue[getLoc];
		queue[getLoc++] = null;

		return value;
	}

	@Override
	public synchronized void reset() {
		Arrays.fill( queue, null );
		putLoc = getLoc = 0;
	}

	@Override
	public synchronized Stream<T> stream() {
		return StreamSupport.stream( this.spliterator(), false );
	}
}
