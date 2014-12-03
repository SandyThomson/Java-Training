package com.selftest;

import org.junit.Assert;
import org.junit.Test;

public class VarargsTest {

	@Test
	public void testSum() {

		int result = sum(1, 2, 3);

		Assert.assertEquals("result invalid", 6, result);

	}

	private int sum(int... vals) {

		int sum = 0;

		for (int val : vals) {
			sum += val;
		}

		return sum;

	}
}
