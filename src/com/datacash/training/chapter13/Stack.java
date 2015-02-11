
package com.datacash.training.chapter13;

public class Stack<T> implements IGenStack<T> {

	private T[] stack;
	private int pointer = 0;

	public Stack( T[] input ) {
		stack = input;
	}

	@Override
	public void push( T toPush ) throws ArrayFullException {
		if ( pointer == stack.length ) {
			throw new ArrayFullException( "Stack overflow!" );
		}

		stack[pointer++] = toPush;

	}

	@Override
	public T pop() throws ArrayEmptyException {
		if ( pointer == 0 ) {
			throw new ArrayEmptyException( "Stack underflow! Is that even a thing?" );
		}

		return stack[--pointer];
	}

	public void printStack() {

		System.out.print( "Current stack: " );

		for ( int i = 0 ; i < pointer ; i++ ) {
			System.out.print( stack[i] );
		}

		System.out.println();
	}
}
