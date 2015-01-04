package org.java.training.qpack;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.Iterator;

public class CircularQueue<T> implements Queue<T> {
	private T[] queue;
	private int head, tail;
	
	public CircularQueue(int capacity, T... ts) {
		queue = Arrays.copyOf(ts, capacity + 1);
		head = tail = 0;
	}
	
	public <E extends T, Source extends Iterable<E>> CircularQueue( int capacity, Source that ) {
		this(capacity);
		copy(that);
	}
	
	public <E extends T> CircularQueue( CircularQueue<E> that ) {
		queue = Arrays.copyOf(that.queue, that.queue.length);
		this.head = that.head;
		this.tail = that.tail;
	}
	
	public CircularQueue<T> put(T item) {
		if ( (head + 1) % queue.length == tail ) throw new BufferOverflowException();
		queue[head++] = item;
		head %= queue.length;
		return this;
	}

	public T get() {
		if ( tail == head ) throw new BufferUnderflowException();
		T item = queue[tail++];
		tail %= queue.length;
		return item;
	}
	
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int index = tail;
			public boolean hasNext() { return index != head; }

			public T next() {
				T item = queue[index++];
				index %= queue.length;
				return item;
			}
		};
	}

	public CircularQueue<T> reset() {
		head = tail = 0;
		return this;
	}
}