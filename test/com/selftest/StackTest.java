package com.selftest;

import org.junit.Assert;
import org.junit.Test;

import com.selftest.Stack;

public class StackTest {

	@Test
	public void testStackUsage() throws Exception {
		Stack s = new Stack(3);
		s.push('a');
		s.push('b');
		s.push('c');

		char result1 = s.pop();
		char result2 = s.pop();
		char result3 = s.pop();

		Assert.assertEquals("result1 invalid", result1, 'c');
		Assert.assertEquals("result2 invalid", result2, 'b');
		Assert.assertEquals("result3 invalid", result3, 'a');
	}

	@Test(expected = StackFullException.class)
	public void testStackOverrun() throws Exception {
		Stack s = new Stack(3);
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
	}

	@Test(expected = StackEmptyException.class)
	public void testStackEmptyPop() throws Exception {
		Stack s = new Stack(3);
		s.pop();
	}

	@Test
	public void testStackMixedUsage() throws Exception {
		Stack s = new Stack(3);
		s.push('a');
		char result1 = s.pop();
		s.push('b');
		s.push('c');
		s.push('d');

		char result2 = s.pop();
		char result3 = s.pop();
		char result4 = s.pop();

		Assert.assertEquals("result1 invalid", result1, 'a');
		Assert.assertEquals("result2 invalid", result2, 'd');
		Assert.assertEquals("result3 invalid", result3, 'c');
		Assert.assertEquals("result4 invalid", result4, 'b');
	}

}
