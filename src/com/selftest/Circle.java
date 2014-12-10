package com.selftest;

import java.lang.Math;

public class Circle extends TwoDShape {

	private int radius;

	public Circle(int radius) {
		super(radius * 2, radius * 2);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (radius * radius) * Math.PI;
	}

}
