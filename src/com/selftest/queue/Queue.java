
package com.selftest.queue;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.stream.Stream;

public interface Queue<T> extends Iterable<T> {

	Queue<T> put( T value ) throws BufferOverflowException;

	T get() throws BufferUnderflowException;

	default void reset() throws NoSuchMethodException {
		throw new NoSuchMethodException();
	}

	Stream<T> stream();
}
