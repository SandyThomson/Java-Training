package org.java.training.qpack;

import java.nio.BufferUnderflowException;
import java.util.Iterator;

/**
 * Singly-linked queue implementation. 
 */
public class LinkedQueue<T> implements Queue<T> {
	private class Node {
		T item;
		Node next;
	}
	private Node head;
	
	public LinkedQueue() {
		head = new Node();
		head.next = head;
	}
	
	public <E extends T, Source extends Iterable<E>> LinkedQueue( Source that ) {
		this();
		copy(that);
	}

	public LinkedQueue<T> put(T item) {
		Node init = head.next;
		head.next = new Node();
		head = head.next;
		head.item = item;
		head.next = init;
		return this;
	}

	public T get() {
		T item = head.next.next.item;
		if ( head.next == head ) throw new BufferUnderflowException();
		head.next = head.next.next;
		return item;
	}

	public LinkedQueue<T> reset() {
		head.item = null;
		head.next = head;
		return this;
	}
	
	public Iterator<T> iterator() {
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