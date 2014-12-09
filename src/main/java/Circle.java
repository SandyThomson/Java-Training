/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public class Circle extends TwoDShape {

	/**
	 * 
	 */
	public Circle() {
		super();
	}

	/**
	 * @param x
	 * @param n
	 */
	public Circle(double x, String n) {
		super(x, n);
	}

	/**
	 * @param ob
	 */
	public Circle(TwoDShape ob) {
		super(ob);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see main.java.TwoDShape#area()
	 */
	@Override
	double area() {
		double r = super.getHeight() / 2;
		return Math.PI * (Math.pow(r, 2));
	}

}
