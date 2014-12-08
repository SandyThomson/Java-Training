package org.java.training.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 2.
 */
public class CircleDemo {
	public static void main(String[] args) {
		List<? extends TwoDShape> shapes = circles(34.d, 55.d, 10.d, 1.399d);
		
		shapes.stream().map(s -> s.area())
			.forEach(d -> System.out.printf("Got circle with [%.4f] area.%n", d));
	}

	public static List<Circle> circles(double... diameters) {
		return Arrays.stream(diameters).mapToObj(Circle::new).collect(Collectors.toList());
	}
}

class Circle extends TwoDShape {

	Circle(double diameter) {
		super(diameter, "circle");
	}

	Circle(Circle that) {
		super(that);
	}

	@Override
	public double area() {
		double r = getWidth() / 2.d;
		return Math.PI * (r * r);
	}
}

/**
 * The poorly designed shape class from the book.
 */
abstract class TwoDShape {
	private double width, height;
	private String name;
	
	TwoDShape() {
		width = height = 0.d;
		name = "none";
	}
	
	TwoDShape(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	TwoDShape(double bounds, String name) {
		width = height = bounds;
		this.name = name;
	}
	
	TwoDShape(TwoDShape that) {
		this.width = that.width;
		this.height = that.height;
		this.name = that.name;
	}
	
	public abstract double area();
	
	double getWidth() { return width; }
	double getHeight() { return height; }
	String getName() { return name; }
	
	TwoDShape setWidth(double width) {
		this.width = width;
		return this;
	}
	
	TwoDShape setHeight(double height) {
		this.height = height;
		return this;
	}
	
	TwoDShape printBounds() {
		System.out.printf("Width [%.4f], height [%.4f]%n", width, height);
		return this;
	}
}