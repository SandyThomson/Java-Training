package org.java.training.qpack;

import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.Iterator;

public class DynamicQueue<T> implements Queue<T> {
	public static final int DEFAULT_CAPACITY = 32;
	private T[] queue;
	private int head, tail;
	
	private DynamicQueue(int capacity, T... ts) {
		queue = Arrays.copyOf(ts, capacity);
		head = tail = 0;
	}
	
	public DynamicQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	public <E extends T, Source extends Iterable<E>> DynamicQueue( Source that ) {
		this();
		copy(that);
	}
	
	public DynamicQueue<T> put(T item) {
		if ( (head + 1) % queue.length == tail ) realloc();
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
	
	private void realloc() {
		DynamicQueue<T> next = new DynamicQueue<>(queue.length + (queue.length >> 1));
		stream().forEach(next::put);
		this.queue = next.queue;
		this.head = next.head;
		this.tail = next.tail;
	}

	public DynamicQueue<T> reset() {
		head = tail = 0;
		return this;
	}
}