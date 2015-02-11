package org.java.training;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Self-Test question 12.
 */
public class StackDemo {
	public static void main(String... args) {
		Stack<String> stack = new FixedStack<>(10, "Flame", "Bubblegum", "Lumpy Space", "Ghost", "Slime", "Breakfast", "Crab", "Wildberry");
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

interface Stack<T> extends Iterable<T> {
	Stack<T> push(T element);
	T pop();
	boolean hasNext();

	default Stream<T> stream() {
		return StreamSupport.stream(spliterator(), false);
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

class FixedStack<T> implements Stack<T> {
	private T[] stack;
	private int head;
	
	public FixedStack(int length, T... ts) {
		stack = Arrays.copyOf(ts, length);
		head = ts.length;
	}
	
	public <R extends T> FixedStack(R[] ts) {
		this(ts.length);
		Arrays.stream(ts).forEach(this::push);
	}

	public FixedStack(Collection<? extends T> ts) {
		this(ts.size());
		ts.stream().forEach(this::push);
	}

	public FixedStack(FixedStack<? extends T> that) {
		this(that.capacity());
		for(int i = 0; i < that.length(); this.push(that.stack[i++]));
	}
	
	public FixedStack<T> push(T item) {
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
}
