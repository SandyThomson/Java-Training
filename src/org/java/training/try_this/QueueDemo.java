package org.java.training.try_this;

import java.nio.BufferUnderflowException;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Try This 13-1, with a singly-linked queue implementation.
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<Double> doubles = new LinkedQueue<>();
		doubles.put(15.5).put(12.2).put(19.4);
		
		Queue<Number> numbers = new LinkedQueue<>(doubles);
		numbers.put(25).put(28).put(50);
		
		numbers.stream().forEach(System.out::println);
	}
}

interface Queue<T> extends Iterable<T> {
	Queue<T> put(T item);
	T get();
	boolean hasNext();
	
	default Stream<T> stream() {
		return StreamSupport.stream(spliterator(), false);
	}
	
	default Queue<T> putAll( Iterable<? extends T> that ) {
		that.forEach(this::put);
		return this;
	}
}

class LinkedQueue<T> implements Queue<T> {
	private class Node {
		T item;
		Node next;
	}
	private Node head;
	
	public LinkedQueue() {
		head = new Node();
		head.next = head;
	}
	
	public LinkedQueue( Iterable<? extends T> that ) {
		this();
		putAll(that);
	}

	public LinkedQueue<T> put(T item) {
		Node init = head.next;
		head.next = new Node();
		head = head.next;
		head.item = item;
		head.next = init;
		return this;
	}
	
	public synchronized boolean hasNext() {
		return head.next != head;
	}

	public synchronized T get() {
		T item = head.next.next.item;
		if ( head.next == head ) throw new BufferUnderflowException();
		head.next = head.next.next;
		return item;
	}
	
	public synchronized Iterator<T> iterator() {
		return new Iterator<T>() {
			Node index = head.next.next;

			public boolean hasNext() {
				return index != head.next;
			}
			public T next() {
				T item = index.item;
				index = index.next;
				return item;
			}
		};
	}
}