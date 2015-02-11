package ch13;

// A Stack class for characters.
class Stack<T> implements IGenStack<T> {

	private T s[]; // this array holds the stack   
	private int loc; // the indices   

	@SuppressWarnings( "unchecked" )
	// Construct an empty stack given its size.  
	Stack( int size ) {
		s = (T[]) new Object[size]; // this line created the unchecked warning above...
		loc = 0;
	}

	// Construct a stack from a stack.  
	Stack( Stack<T> aRef ) {
		loc = aRef.loc;
		s = aRef.s;
	}

	// Construct a stack with initial values.  
	Stack( T[] aRef ) {
		loc = 0;
		s = aRef;

		try {
			for ( int i = 0 ; i < aRef.length ; i++ )
				push( aRef[i] );
		}
		catch ( StackFullException e ) {
			System.out.println( "Stack Full!" );
		}
	}

	// Put a character into the stack.   
	@Override
	public void push( T o ) throws StackFullException {
		if ( loc == s.length ) {
			throw new StackFullException();
		}

		s[loc++] = o;
	}

	// Get a character from the stack.  
	@Override
	public T pop() throws StackEmptyException {
		if ( loc == 0 ) {
			throw new StackEmptyException();
		}

		return s[--loc];
	}
}

