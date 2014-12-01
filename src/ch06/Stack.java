package ch06;

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

		for ( int i = 0 ; i < a.length ; i++ )
			push( a[i] );
	}

	// Put a character into the stack.   
	void push( char ch ) {
		if ( loc == s.length ) {
			System.out.println( " -- Stack is full." );
			return;
		}

		s[loc++] = ch;
	}

	// Get a character from the stack.  
	char pop() {
		if ( loc == 0 ) {
			System.out.println( " -- Stack is empty." );
			return (char) 0;
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
		for ( i = 0 ; i < 10 ; i++ )
			s1.push( (char) ('A' + i) );

		// construct stack from another stack  
		Stack s3 = new Stack( s1 );

		// Show the stack.  
		System.out.print( "Contents of s1: " );
		for ( i = 0 ; i < 10 ; i++ ) {
			ch = s1.pop();
			System.out.print( ch );
		}

		System.out.println( "\n" );

		System.out.print( "Contents of q2: " );
		for ( i = 0 ; i < 3 ; i++ ) {
			ch = s2.pop();
			System.out.print( ch );
		}

		System.out.println( "\n" );

		System.out.print( "Contents of q3: " );
		for ( i = 0 ; i < 10 ; i++ ) {
			ch = s3.pop();
			System.out.print( ch );
		}
	}
}
