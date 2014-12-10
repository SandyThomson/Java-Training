package mcm.chapter7;


class TwoDShape {
	private double width;
	private double height;
	
	// A default constructor.
	TwoDShape() {
		width = height = 0.0;
	}
	
	// Parameterized constructor.
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	// Construct an object with equal width and height.
	TwoDShape(double x) {
		width = height = x;
	}
	// Construct an object from an object.
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
	}
	
	// Accessor methods for width and height.
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth( double w ) {
		width = w;
	}
	
	public void setHeight( double h ) {
		height = h;
	}
	
	public double getArea() {
		return width * height;
	}

	public void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
}
