
package com.datacash.training.chapter13;

public class QuestionTwelve {

	public static void main( String[] args ) {

		try {

			Stack<Character> stack = new Stack<Character>( new Character[5] );
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
		catch ( ArrayFullException | ArrayEmptyException e ) {
			System.out.println( e.getMessage() );
		}

		try {

			Stack<Integer> stack = new Stack<Integer>( new Integer[5] );
			// Push x2
			stack.push( 1 );
			stack.push( 2 );
			stack.printStack();
			// Now try to pop it all and more
			System.out.println( "Pop stack: " + stack.pop() );
			System.out.println( "Pop stack: " + stack.pop() );
			System.out.println( "Pop stack: " + stack.pop() );

		}
		catch ( ArrayFullException | ArrayEmptyException e ) {
			System.out.println( e.getMessage() );
		}

	}

}
