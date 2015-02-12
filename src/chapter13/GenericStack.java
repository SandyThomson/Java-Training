package chapter13;

import chapter9.StackEmptyException;
import chapter9.StackFullException;

// A stack class for characters.  
class GenericStack {
	private char stck[]; // this array holds the stack
	private int tos; // top of stack

	// Construct an empty Stack given its size.
	GenericStack(int size) {
		stck = new char[size]; // allocate memory for stack
		tos = 0;
	}

	// Construct a Stack from a Stack.
	GenericStack(GenericStack ob) {
		tos = ob.tos;
		stck = new char[ob.stck.length];

		// copy elements
		for (int i = 0; i < tos; i++)
			stck[i] = ob.stck[i];
	}

	// Construct a stack with initial values.
	GenericStack(char a[]) throws StackFullException {
		stck = new char[a.length];

		for (int i = 0; i < a.length; i++) {
			push(a[i]);
		}
	}

	// Push characters onto the stack.
	void push(char ch) throws StackFullException {
		if (tos == stck.length) {
			throw new StackFullException();
		}

		stck[tos] = ch;
		tos++;
	}

	// Pop a character from the stack.
	char pop() throws StackEmptyException {
		if (tos == 0) {
			throw new StackEmptyException();
		}

		tos--;
		return stck[tos];
	}
}