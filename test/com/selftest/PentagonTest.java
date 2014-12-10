package com.selftest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PentagonTest {

	@Test
	public void testPentagon() {
		int edgeLength = 8;
		Pentagon p = new Pentagon(edgeLength);

		assertEquals(15, p.getWidth());
		assertEquals(12, p.getHeight());

		double tolerance = 0.01;
		assertEquals(110.11, p.getArea(), tolerance);

	}
}
