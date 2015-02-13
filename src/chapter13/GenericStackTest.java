
package chapter13;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chapter9.StackEmptyException;
import chapter9.StackFullException;

public class GenericStackTest {

	@Test
	public void testIntegerStack() throws StackEmptyException, StackFullException {
		Integer[] x = { 1, 2, 3, 4, 5 };
		GenericStack<Integer> ints = new GenericStack<>( x );

		assertEquals( 5, (int) ints.pop() );
		assertEquals( 4, (int) ints.pop() );

		ints.push( 9 );
		assertEquals( 9, (int) ints.pop() );
	}

	@Test
	public void testStringStack() throws StackEmptyException, StackFullException {
		String[] x = { "Hartnell", "Troughton", "Pertwee", "Baker", "Davison", "Baker", "McCoy", "McGann", "Hurt", "Eccleston", "Tennant", "Smith", "Capaldi" };
		GenericStack<String> strings = new GenericStack<>( x );

		assertEquals( "Capaldi", strings.pop() );
		assertEquals( "Smith", strings.pop() );

		strings.push( "Capaldi" );
		assertEquals( "Capaldi", strings.pop() );
	}

}
