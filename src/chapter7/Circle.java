/**
 * 
 */
package chapter7;


/**
 * @author fitzretsil
 *
 */
public class Circle extends TwoDShape {
	
	Circle() {
		super();
	}
	
	Circle ( double x ) {
		super( x, "Circle" );
	}
	
	public double area() {
		double radius = getWidth()/2;
		double pi = Math.PI;
		
		return ( radius * radius ) * pi;
	}

}
