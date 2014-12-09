/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public class Demoer {

	public static void main(String... args) {
		TwoDShape shape = new Circle(2, "blarg");

		System.out.println("Area = " + shape.area());
	}

}
