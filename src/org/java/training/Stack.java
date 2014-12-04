package org.java.training;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Self-Test question 3.
 */
public class Stack<T> implements Iterable<T> {
	private T[] stack;
	private int head;

	public Stack(int length, T... ts) {
		stack = Arrays.copyOf(ts, length);
		head = ts.length;
	}
	
	public Stack<T> push(T item) {
		if ( head >= stack.length )
			throw new BufferOverflowException();
		stack[head++] = item;
		return this;
	}
	
	public T pop() {
		if ( head <= 0 )
			throw new BufferUnderflowException();
		return stack[--head];
	}
	
	public T peek() {
		if ( head == 0 ) return null;
		return stack[head - 1];
	}
	
	public int length() { return head; }
	public int capacity() { return stack.length; }
	public boolean hasNext() { return head > 0; }
	
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int n = head;
			public boolean hasNext() { return n > 0; }
			public T next() { return stack[--n]; }
		};
	}

	public Stream<T> stream() {
		return StreamSupport.stream(spliterator(), false);
	}

	public static void main(String[] args) {
		StackDemo.demo();
	}
}

class StackDemo {
	public static void demo() {
		Stack<String> stack = new Stack<>(10, "Flame", "Bubblegum", "Lumpy Space", "Ghost", "Slime", "Breakfast", "Crab", "Wildberry");
		stack.push("Turtle").push("Hot Dog");
		
		stack.stream().forEach(System.out::println);

		System.out.println();
		
		while(stack.hasNext())
			System.out.println(stack.pop());
	}
}
