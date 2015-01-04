package org.java.training.qpack;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.Iterator;

public class FixedQueue<T> implements Queue<T> {
	private T[] queue;
	private int head, tail;
	
	public FixedQueue(int capacity, T... ts) {
		queue = Arrays.copyOf(ts, capacity);
		head = tail = 0;
	}
	
	public <E extends T, Source extends Iterable<E>> FixedQueue( int capacity, Source that ) {
		this(capacity);
		copy(that);
	}
	
	public <E extends T> FixedQueue( FixedQueue<E> that ) {
		queue = Arrays.copyOf(that.queue, that.queue.length);
		this.head = that.head;
		this.tail = that.tail;
	}
	
	public FixedQueue<T> put(T item) {
		if ( head == queue.length ) throw new BufferOverflowException();
		queue[head++] = item;
		return this;
	}

	public T get() {
		if ( tail == head ) throw new BufferUnderflowException();
		return queue[tail++];
	}

	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int index = tail;
			public boolean hasNext() { return index < head; }
			public T next() { return queue[index++]; }
		};
	}

	public FixedQueue<T> reset() {
		head = tail = 0;
		return this;
	}
}