package com.selftest;

public abstract class TwoDShape {

	private int width;
	private int height;

	public TwoDShape(int width, int height) {
		super();
		this.setWidth(width);
		this.setHeight(height);
	}

	public abstract double getArea();

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
