package com.selftest;

import org.junit.Assert;
import org.junit.Test;

public class SwapTest {

	@Test
	public void testSwap(){
		ExampleObject a = new ExampleObject(1);
		ExampleObject b = new ExampleObject(2);
		
		// Check before swap
		Assert.assertEquals("Wrong object", 1, a.var);
		Assert.assertEquals("Wrong object", 2, b.var);
		
		swap(a, b);
		
		// Check after swap
		Assert.assertEquals("Wrong object", 2, a.var);
		Assert.assertEquals("Wrong object", 1, b.var);

	}
	
	private void swap(ExampleObject a, ExampleObject b){
		int temp = a.var;
		a.var = b.var;
		b.var = temp;
	}
	
}
