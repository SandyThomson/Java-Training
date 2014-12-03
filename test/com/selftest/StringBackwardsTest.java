package com.selftest;

import org.junit.Assert;
import org.junit.Test;

public class StringBackwardsTest {

	@Test
	public void stringBackwardsTest() {
		String result = StringBackwards.reverse("abcdef");
		Assert.assertEquals("result invalid", "fedcba", result);
	}

}
