
package com.training.datacash.chapter7;

public abstract class TwoDShape {

	private double length;
	private double width;

	public TwoDShape( double length, double width ) {
		this.length = length;
		this.width = width;
	}

	public abstract double getArea();

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

}
