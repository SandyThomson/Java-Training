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
public class WeightOnTheMoonTest {

	@Test
	public void testMainWithNormalIntegerReturnsAccurateWeight() throws IOException {
		// Arrange
		String[] input = { "100" };
		String expected = "Your weight would be 83.0kg on the moon.\n";
		
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		//Act
		WeightOnTheMoon.main(input);
		final String actual = myOut.toString();
		
		// Assert
		assertEquals( expected, actual );
	}
	
	@Test
	public void testMainWithNormalDoubleReturnsAccurateWeight() throws IOException {
		// Arrange
		String[] input = { "71.8" };
		String expected = "Your weight would be 59.6kg on the moon.\n";
		
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		//Act
		WeightOnTheMoon.main(input);
		final String actual = myOut.toString();
		
		// Assert
		assertEquals( expected, actual );
	}
	
	@Test
	public void testMainWithStringReturnsError() throws IOException {
		// Arrange
		String[] input = { "seventy" };
		String expected = "Please provide your weight in kgs numerically.\n";
		
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		//Act
		WeightOnTheMoon.main(input);
		final String actual = myOut.toString();
		
		// Assert
		assertEquals( expected, actual );
	}

}
