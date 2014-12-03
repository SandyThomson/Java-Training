
package com.datacash.training;

public class QuestionThree {

	public static void main( String[] args ) {

		try {

			Stack stack = new Stack( 5 );
			// Push x2
			stack.push( 'h' );
			stack.push( 'e' );
			stack.printStack();
			// Pop
			System.out.println( "Pop stack: " + stack.pop() );
			stack.printStack();
			// Push x3
			stack.push( 'l' );
			stack.push( 'l' );
			stack.push( 'o' );
			stack.printStack();
			//Pop twice
			System.out.println( "Pop stack: " + stack.pop() );
			System.out.println( "Pop stack: " + stack.pop() );
			stack.printStack();

			// Now try to overflow
			stack.push( 'w' );
			stack.push( 'o' );
			stack.push( 'r' );
			stack.push( 'l' );
			stack.push( 'd' );

		}
		catch ( Exception e ) {
			System.out.println( e.getMessage() );
		}

	}

}
