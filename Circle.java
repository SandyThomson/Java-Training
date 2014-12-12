public class Circle extends TwoDShape {

  private static final String NAME_OF_SHAPE = "circle";

  Circle() {
    super();
  }

  Circle( double x ) {
    super( x, NAME_OF_SHAPE );
  }

  public double getRadius(){
    return getWidth() / 2;
  }

  double area(){
    return Math.PI * Math.pow( getRadius(), 2 );
  }

}
