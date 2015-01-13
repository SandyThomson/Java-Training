
package ch09;

class StackFullException extends Exception {
	// not sure if the default value is better than suppressing the warning about it not being declared?
	private static final long serialVersionUID = 1L;

}

// not sure if suppressing the warning about it not being declared is better than the default value?
@SuppressWarnings( "serial" )
class StackEmptyException extends Exception {
	// documenting the emptiness!
}

// A Stack class for characters.
class Stack {

	private char s[]; // this array holds the stack   
	private int loc; // the indices   

	// Construct an empty stack given its size.  
	Stack( int size ) {
		s = new char[size]; // allocate memory for stack   
		loc = 0;
	}

	// Construct a stack from a stack.  
	Stack( Stack ob ) {
		loc = ob.loc;
		s = new char[ob.s.length];

		// copy elements  
		for ( int i = 0 ; i < loc ; i++ )
			s[i] = ob.s[i];
	}

	// Construct a stack with initial values.  
	Stack( char a[] ) {
		loc = 0;
		s = new char[a.length];

		try {
			for ( int i = 0 ; i < a.length ; i++ )
				push( a[i] );
		}
		catch ( StackFullException e ) {
			System.out.println( "Stack Full!" );
		}
	}

	// Put a character into the stack.   
	void push( char ch ) throws StackFullException {
		if ( loc == s.length ) {
			throw new StackFullException();
		}

		s[loc++] = ch;
	}

	// Get a character from the stack.  
	char pop() throws StackEmptyException {
		if ( loc == 0 ) {
			throw new StackEmptyException();
		}

		return s[--loc];
	}
}

//Demonstrate the Stack class.   
class SDemo2 {

	public static void main( String args[] ) {
		// construct 10-element empty stack  
		Stack s1 = new Stack( 10 );

		char name[] = { 'T', 'o', 'm' };
		// construct stack from array  
		Stack s2 = new Stack( name );

		char ch;
		int i;

		// put some characters into q1   
		for ( i = 0 ; i < 11 ; i++ ) {
			try {
				s1.push( (char) ('A' + i) );
			}
			catch ( StackFullException e ) {
				System.out.println( "Stack Full!" );
			}
		}

		// construct stack from another stack  
		Stack s3 = new Stack( s1 );

		// Show the stack.  
		System.out.print( "Contents of s1: " );
		for ( i = 0 ; i < 11 ; i++ ) {
			try {
				ch = s1.pop();
				System.out.print( ch );
			}
			catch ( StackEmptyException e ) {
				System.out.println();
				System.out.println( "Stack Empty!" );
			}
		}

		System.out.println( "\n" );

		System.out.print( "Contents of q2: " );
		for ( i = 0 ; i < 4 ; i++ ) {
			try {
				ch = s2.pop();
				System.out.print( ch );
			}
			catch ( StackEmptyException e ) {
				System.out.println();
				System.out.println( "Stack Empty!" );
			}
		}

		System.out.println( "\n" );

		System.out.print( "Contents of q3: " );
		for ( i = 0 ; i < 11 ; i++ ) {
			try {
				ch = s3.pop();
				System.out.print( ch );
			}
			catch ( StackEmptyException e ) {
				System.out.println();
				System.out.println( "Stack Empty!" );
			}
		}
	}
}
