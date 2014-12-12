// Create an abstract class.
abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	// A default constructor.
	TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	// Parameterized constructor.
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	// Construct object with equal width and height.
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	// Construct an object from an object.
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	// Accessor methods for width and height.
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	String getName() { return name; }
	void showDim() {
		System.out.println("Width and height are " +
				width + " and " + height);
	}
	// Now, area() is abstract.
	abstract double area();
}

// A subclass of TwoDShape for triangles.
class Circle extends TwoDShape {
	// A default constructor.
	Circle() {
		super();
		style = "none";
	}
	// One argument constructor.
	Circle(double x) {
		super(x, "ircle"); // call superclass constructor
		style = "filled";
	}
	// Construct an object from an object.
	Circle(Circle ob) {
		super(ob); // pass object to TwoDShape constructor
		style = ob.style;
	}
	double area() {
		return 2 * Math.PI * getWidth() * getWidth();
	}
}

public class Question2 {
	public static void main(String args[]) {
		TwoDShape shape = new Circle(4);
		System.out.println( shape.area() );
	}
}
