/**
 * 
 */
package chapter7;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author fitzretsil
 *
 */
public class CircleTest {

	/**
	 * Test method for {@link chapter7.Circle#area()}.
	 */
	@Test
	public void testArea() {
		double input = 10.0;
		double expected = 78.54;
		
		Circle test = new Circle( input );
		double actual = test.area();
		
		assertEquals( expected, actual, 0.01 );		
	}

}
