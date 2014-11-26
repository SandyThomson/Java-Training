package com.selftest;

import org.junit.Assert;
import org.junit.Test;

public class StringArraySorterTest {

	@Test
	public void testSort() {
		String[] array1 = { "goo", "Goo", "Good", "bar", "zzz", "Blarg",
				"£$$%$^&&", "WTF", "a2432£few" };

		String[] expected = { "a2432£few", "bar", "Blarg", "Goo", "goo",
				"Good", "WTF", "zzz", "£$$%$^&&" };
		String[] actual = StringArraySorter.bubbleSort(array1);

		Assert.assertArrayEquals("Arrays not equal", expected, actual);

	}

}
