package chapter13;

import chapter9.StackEmptyException;
import chapter9.StackFullException;

// A stack class for characters.  
class GenericStack<T> {

	private T[] stck; // this array holds the stack
	private int tos; // top of stack

	// Construct a stack with initial values.
	GenericStack( T[] a ) throws StackFullException {
		stck = a;

		for (int i = 0; i < a.length; i++) {
			push(a[i]);
		}
	}

	// Push characters onto the stack.
	void push( T x ) throws StackFullException {
		if (tos == stck.length) {
			throw new StackFullException();
		}

		stck[tos] = x;
		tos++;
	}

	// Pop a character from the stack.
	T pop() throws StackEmptyException {
		if (tos == 0) {
			throw new StackEmptyException();
		}

		tos--;
		return stck[tos];
	}
}