package ch07;

// A subclass of TwoDShape for circles.
public class Circle extends TwoDShape {

	static final double PI = 3.14159265359;

	// A default constructor.  
	Circle() {
		super();
	}

	// Construct a circle.  
	Circle( double x ) {
		// this sets height and width to x, so I guess for circles
		// that corresponds to diameter
		super( x, "circle" ); // call superclass constructor  
	}

	@Override
	double area() {
		double radius = getWidth() / 2;
		return PI * radius * radius;
	}
}

