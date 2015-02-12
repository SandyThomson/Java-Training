package chapter13;

import org.junit.Assert;
import org.junit.Test;

import chapter9.StackEmptyException;
import chapter9.StackFullException;

public class GenericStackTest {

	@Test
	public void test() throws StackFullException, StackEmptyException {
		Integer[] x = { 1, 2, 3, 4, 5 };
		GenericStack<Integer> ints = new GenericStack<>( x );

		Assert.assertEquals( 5, (int) ints.pop() );
	}

}
