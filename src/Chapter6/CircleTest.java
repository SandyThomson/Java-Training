package Chapter6;

import org.junit.Test;
import org.junit.Assert;

import Chapter6.Circle;

public class CircleTest {

  @Test
  public void testCircle() {
    
    Circle circle = new Circle ( 10.0 );
    
    Assert.assertEquals( 10.0, circle.getWidth(), 0 );
    Assert.assertEquals( 10.0, circle.getHeight(), 0 );
    
    // This can be close enough
    Assert.assertEquals( 78.54, circle.area(), 0.1 );
  }

}
