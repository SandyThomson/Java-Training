package com.selftest;

import org.junit.Assert;
import org.junit.Test;

public class DoubleAverageTest {

	@Test
	public void testComputeAverage() {
		double[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.01, 11.02, 12.03 };

		Double expected = 6.505;
		Double actual = DoubleAverage.computeAverage(array1);

		Assert.assertEquals("Average incorrect", expected, actual);

	}

}
