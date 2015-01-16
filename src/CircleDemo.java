
abstract class TwoDShape {
	private double width;
	private double height;
	private String name;

	TwoDShape() {                             // A default constructor.
		width = height = 0.0;
		name  = "none";
	}

	TwoDShape(double w, double h, String n) { // Parameterized constructor.
		width  = w;
		height = h;
		name   = n;
	}

	TwoDShape(double x, String n) {           // Construct object with equal width and height.
		width = height = x;
		name  = n;
	}

	TwoDShape(TwoDShape ob) {                 // Construct an object from an object.
		width  = ob.width;
		height = ob.height;
		name   = ob.name;
	}

	// Accessor methods for width and height.
	double getWidth()        { return width;  }
	double getHeight()       { return height; }
	String getName()         { return name;   }
	void setWidth(double w)  { width  = w;    }
	void setHeight(double h) { height = h;    }
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

	abstract double area(); // Now, area() is abstract.
}

class Circle extends TwoDShape {
	
	Circle() {
		super();
	}
	
	Circle(double w, double h, String n){
		super(w, h, n);
	}
	
	Circle(double x, String n) {
		super(x, n);
	}
	
	Circle(TwoDShape ob) {
		super(ob);
	}
	
	double area() {
		return (double) this.getWidth() * this.getHeight();
	}
}

class CircleDemo {
	public static void main (String args[]) {
		Circle a = new Circle(1.2, 1.3, "Small Circle");
		System.out.println( "the area of a is " + a.area() );
	}
}
