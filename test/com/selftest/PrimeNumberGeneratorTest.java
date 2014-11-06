package com.selftest;

import static com.selftest.PrimeNumberGenerator.getPrimeNumbersForRange;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberGeneratorTest {

	@Test
	public void testPrimesTwoToOneHundred() {

		ArrayList<Integer> primeNumbersForRange = getPrimeNumbersForRange(2,
				100);

		Assert.assertEquals(
				Arrays.asList(new Integer[] { 3, 5, 7, 11, 13, 17, 19, 23, 29,
						31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
						97 }), primeNumbersForRange);
	}

}
