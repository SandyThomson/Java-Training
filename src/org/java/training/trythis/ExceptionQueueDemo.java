package org.java.training.trythis;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Try This 9-1. Using a RuntimeException instead, because who
 * wants to wrap put/get calls in try/catch?
 */
public class ExceptionQueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new FixedQueue<>(4);
		queue.put("The").put("owls").put("are").put("not");
		
		try {
			queue.put("what").put("they").put("seem");
		} catch ( QueueFullException e ) {
			e.printStackTrace();
		}
		
		try {
			while(true) queue.get();
		} catch ( QueueEmptyException e ) {
			e.printStackTrace();
		}
	}
}

class QueueFullException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public QueueFullException(int size) {
		super( String.format("Insertion attempt exceeds maximum queue size [%d]", size) );
	}
}

class QueueEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public <T extends Queue<?>> QueueEmptyException(T queue) {
		super( String.format("%s is empty", queue.getClass().getName() ) );
	}
}

interface Queue<T> extends Iterable<T> {
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

class FixedQueue<T> implements Queue<T> {
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
		if ( head == queue.length ) throw new QueueFullException(head);
		queue[head++] = item;
		return this;
	}

	public T get() {
		if ( tail == head ) throw new QueueEmptyException(this);
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