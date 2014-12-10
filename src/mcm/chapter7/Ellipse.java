package mcm.chapter7;


public class Ellipse extends TwoDShape {

	/**
	 * Constructor to setup a circle (or ellipse) given a width and height
	 * 
	 * @param width
	 * @param height
	 */
	public Ellipse( double width, double height ) {
		super( width, height );

	}
	
	/**
	 * Constructor to setup an ellipse given a radius
	 * 
	 * @param radius
	 */
	public Ellipse( double radius ) {
		super( radius * 2 );
  }
	
	/**
	 * Override the getArea method to return the circle (or Ellipse's area)
	 */
	@Override
	public double getArea() {
		double axisARadius = getWidth() / 2;
		double axisBRadiues = getHeight() / 2;

		double area = Math.PI * axisARadius * axisBRadiues;
		
		return area;
	}
	
	/**
	 * Print out dimensions - show width, height and area
	 */
	@Override
	public void showDim() {
		System.out.println( "Circle Dimensions:" );
		super.showDim();
		System.out.printf( "Area: %.2f", getArea() );
	}

	/**
	 * Main method to run and test this
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		//Setup a basic 2D object
		TwoDShape twoDRectangle = new TwoDShape( 20.00, 40.00 );
		twoDRectangle.showDim();

		System.out.println( "" );
		Ellipse circle = new Ellipse( 10, 10 );
		circle.showDim();
	}

}
