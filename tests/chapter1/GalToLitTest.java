/**
 * 
 */
package chapter1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

/**
 * @author fitzretsil
 *
 */
public class GalToLitTest {

	@Test
	public void testMain() throws IOException {
		// Arrange
		String expected = "10.0 gallons is 37.854 liters.\n";
		
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		//Act
		GalToLit.main(null);
		final String actual = myOut.toString();
		
		// Assert
		assertEquals( expected, actual );
	}

}
