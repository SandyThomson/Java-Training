package org.java.training.qpack;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Queue<T> extends Iterable<T> {
	Queue<T> put(T item);
	T get();
	Queue<T> reset();

	default Stream<T> stream() {
		return StreamSupport.stream(spliterator(), false);
	}
	
	default <E extends T, Source extends Iterable<E>> Queue<T> copy( Source that ) {
		that.forEach(this::put);
		return this;
	}
}