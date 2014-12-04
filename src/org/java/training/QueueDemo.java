package org.java.training;

import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Try This 6-1 & 6-2
 */
public class QueueDemo {
	
	public static void main(String[] args) {
		String[] strs = { "A", "queue", "is", "first", "in" };
		
		Queue<String> queue = new Queue<>( strs );
		queue.put("first").put("out");
		
		Queue<CharSequence> chars = new Queue<>( queue );

		System.out.println( chars.stream().collect( Collectors.joining(" ") ) );
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
	
	public Queue() {}
	public <R extends T> Queue(R[] ts) {
		Arrays.stream(ts).forEach(this::put);
	}

	public <R extends T, X extends Collection<R>> Queue(X ts) {
		ts.stream().forEach(this::put);
	}

	public <R extends T> Queue( Queue<R> that ) {
		that.stream().forEach(this::put);
	}

	public Queue<T> put(T item) {
		Node next = new Node(item);
		if (head == null) {
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
	
	public T peek() {
		return tail == null ? null : tail.item;
	}

	public T get() {
		if (this.length() == 0)
			throw new BufferUnderflowException();
		T i = tail.item;
		tail = tail.next;
		--length;
		return i;
	}
	
	public T at(int i) {
		if ( i < 0 || i >= this.length() )
			throw new IndexOutOfBoundsException();
		Node iter = tail;
		for(int j = 0; j < i; j++)
			iter = iter.next;
		return iter.item;
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
