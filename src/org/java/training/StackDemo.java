package org.java.training;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Self-Test question 10.
 */
public class StackDemo {
	public static void main(String... args) {
		Stack<String> stack = new Stack<>(10, "Flame", "Bubblegum", "Lumpy Space", "Ghost", "Slime", "Breakfast", "Crab", "Wildberry");
		stack.push("Turtle").push("Hot Dog");
		
		stack.stream().forEach(System.out::println);

		try {
			stack.push("Bee");
		} catch( StackOverflowException e ) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		while(stack.hasNext())
			System.out.println(stack.pop());
		
		stack.pop();
	}
}

class StackOverflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public StackOverflowException(int size) {
		super( String.format("Insertion attempt exceeds maximum stack size [%d]", size) );
	}
}

class StackUnderflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public <T extends Stack<?>> StackUnderflowException(T stack) {
		super( String.format("%s is empty", stack.getClass().getSimpleName() ) );
	}
}

class Stack<T> implements Iterable<T> {
	private T[] stack;
	private int head;
	
	public Stack(int length, T... ts) {
		stack = Arrays.copyOf(ts, length);
		head = ts.length;
	}
	
	public <R extends T> Stack(R[] ts) {
		this(ts.length);
		Arrays.stream(ts).forEach(this::push);
	}

	public <R extends T, X extends Collection<R>> Stack(X ts) {
		this(ts.size());
		ts.stream().forEach(this::push);
	}

	public <R extends T> Stack( Stack<R> that ) {
		this(that.capacity());
		for(int i = 0; i < that.length(); this.push(that.stack[i++]));
	}
	
	public Stack<T> push(T item) {
		if ( head >= stack.length )
			throw new StackOverflowException(head);
		stack[head++] = item;
		return this;
	}
	
	public T pop() {
		if ( head <= 0 )
			throw new StackUnderflowException(this);
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
}
