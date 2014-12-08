/*
 * Circular
 */
package Chapter6;

import java.lang.Math;

public class Circle extends TwoDShape {
  
  Circle ( double x ) {
    super(x);
  }
  
  public double area () {
    
    return Math.PI * Math.pow( ( 0.5 * getHeight() ) , 2 ); 
  }

}
