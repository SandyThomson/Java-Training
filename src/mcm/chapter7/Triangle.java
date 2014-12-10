package mcm.chapter7;

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {

	private String style;

	// A default constructor.
	Triangle() {
		super();
		style = "none";
	}

	// Constructor for Triangle.
	Triangle( String s, double w, double h ) {
		super( w, h ); // call superclass constructor
		style = s;
	}
}