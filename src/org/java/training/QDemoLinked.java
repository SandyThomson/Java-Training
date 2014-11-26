package org.java.training;

import java.nio.BufferUnderflowException;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Try this 5-2 but with a singly linked list instead of array
 * to manage the underlying storage.
 */
public class QDemoLinked {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<>();
		queue.put("Hello").put(", ").put("World").put("!");
		
		queue.stream().forEach(System.out::print);
		System.out.println();
	}
}

class Queue<T> implements Iterable<T> {
	
	private class Node {
		Node next;
		T item;
		public Node(T item) {
			this.item = item;
		}
	}
	
	private Node head, tail;
	private int length = 0;
	
	public Queue<T> put( T item ) {
		Node next = new Node(item);
		if ( head == null ) {
			tail = head = next;
		} else {
			head.next = next;
			head = head.next;
		}
		++length;
		return this;
	}
	
	public int length() {
		return length;
	}
	
	public T get() {
		if ( this.length() == 0 ) 
			throw new BufferUnderflowException();
		T i = tail.item;
		tail = tail.next;
		--length;
		return i;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node iter = Queue.this.tail;
			@Override
			public boolean hasNext() {
				return iter != null;
			}
			@Override
			public T next() {
				T i = iter.item;
				iter = iter.next;
				return i;
			}
		};
	}
	
	public Stream<T> stream() {
		return StreamSupport.stream(this.spliterator(), false);
	}

}
