package ch13;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Demonstrate the Stack class.
public class SDemo2 {

	final static int DEMO_STACK_SIZE = 10;

	@Test( expected = StackFullException.class )
	public void testFullException() throws StackFullException {
		// construct 10-element empty stack  
		Stack<Character> s = new Stack<Character>( DEMO_STACK_SIZE );

		for ( int i = 0 ; i < DEMO_STACK_SIZE + 1 ; i++ ) { // SIZE + 1, causes exception
			s.push( (char) ('A' + i) );
		}

	}

	@Test( expected = StackEmptyException.class )
	public void testEmptyException() throws StackEmptyException {
		// construct 10-element empty stack  
		Stack<Character> s = new Stack<Character>( DEMO_STACK_SIZE );

		Character ch = s.pop(); // pop an empty stack, causes exception

		System.out.print( ch );

	}

	@Test
	public void testCharacterStack() throws StackFullException, StackEmptyException {
		// construct 10-element empty stack  
		Stack<Character> s = new Stack<Character>( DEMO_STACK_SIZE );

		for ( int i = 0 ; i < DEMO_STACK_SIZE ; i++ ) {
			s.push( (char) ('A' + i) );
		}

		for ( int i = DEMO_STACK_SIZE - 1 ; i > 0 ; i-- ) {
			assertEquals( "Popped Character is not as expected", s.pop(), (Character) (char) ('A' + i) ); // horrible double casting, avoids ambiguity error
		}

	}

	@Test
	public void testIntegerStack() throws StackFullException, StackEmptyException {
		// construct 10-element empty stack  
		Stack<Integer> s = new Stack<Integer>( DEMO_STACK_SIZE );

		for ( int i = 0 ; i < DEMO_STACK_SIZE ; i++ ) {
				s.push( i );
		}

		for ( int i = DEMO_STACK_SIZE - 1 ; i > 0 ; i-- ) {
			assertEquals( "Popped Integer is not as expected", s.pop(), (Integer) i );
		}

	}

	@Test
	public void testConstructFromArray() throws StackEmptyException {
		Integer nums[] = { 1, 2, 3 };
		// construct stack from array  
		Stack<Integer> s = new Stack<Integer>( nums );

		assertEquals( "Popped Integer is not as expected", s.pop(), (Integer) 3 );
		assertEquals( "Popped Integer is not as expected", s.pop(), (Integer) 2 );
		assertEquals( "Popped Integer is not as expected", s.pop(), (Integer) 1 );

	}

	@Test
	public void testConstructFromStack() throws StackFullException, StackEmptyException {
		// construct 10-element empty stack  
		Stack<Integer> s1 = new Stack<Integer>( DEMO_STACK_SIZE );

		for ( int i = 0 ; i < DEMO_STACK_SIZE ; i++ ) {
				s1.push( i );
		}

		// construct stack from another stack  
		Stack<Integer> s2 = new Stack<Integer>( s1 );

		for ( int i = DEMO_STACK_SIZE - 1 ; i > 0 ; i-- ) {
			assertEquals( "Popped Integer is not as expected", s2.pop(), (Integer) i );
		}

	}
	
}

