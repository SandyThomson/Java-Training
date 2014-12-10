package com.selftest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testCircle() {
		int radius = 5;
		Circle c = new Circle(radius);

		assertEquals(10, c.getWidth());
		assertEquals(10, c.getHeight());

		double tolerance = 0.01;
		assertEquals(78.53, c.getArea(), tolerance);

	}

}
