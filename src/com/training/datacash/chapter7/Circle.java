
package com.training.datacash.chapter7;

public class Circle extends TwoDShape {

	// For a circle, width and length are both diameter.
	public Circle( double diameter ) {
		super( diameter, diameter );
	}

	@Override
	public double getArea() {
		double radius = getWidth() / 2;

		return Math.PI * radius * radius;
	}

}
