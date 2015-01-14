
package com.datacash.training;

public class Stack {

	private char[] stack;
	private int pointer = 0;

	public Stack( int size ) {
		stack = new char[size];
	}

	public void push( char character ) throws ArrayFullException {
		if ( pointer == stack.length ) {
			throw new ArrayFullException( "Stack overflow!" );
		}

		stack[pointer++] = character;

	}

	public char pop() throws ArrayEmptyException {
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
