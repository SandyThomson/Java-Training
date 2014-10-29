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
public class GalToLitTableTest {

	@Test
	public void testMain() throws IOException {
		// Arrange
		String expected = "1.0 gallons is 3.7854 liters.\n" +
				"2.0 gallons is 7.5708 liters.\n" +
				"3.0 gallons is 11.356200000000001 liters.\n" +
				"4.0 gallons is 15.1416 liters.\n" +
				"5.0 gallons is 18.927 liters.\n" +
				"6.0 gallons is 22.712400000000002 liters.\n" +
				"7.0 gallons is 26.4978 liters.\n" +
				"8.0 gallons is 30.2832 liters.\n" +
				"9.0 gallons is 34.0686 liters.\n" +
				"10.0 gallons is 37.854 liters.\n" +
				"\n" +
				"11.0 gallons is 41.6394 liters.\n" +
				"12.0 gallons is 45.424800000000005 liters.\n" +
				"13.0 gallons is 49.2102 liters.\n" +
				"14.0 gallons is 52.9956 liters.\n" +
				"15.0 gallons is 56.781 liters.\n" +
				"16.0 gallons is 60.5664 liters.\n" +
				"17.0 gallons is 64.3518 liters.\n" +
				"18.0 gallons is 68.1372 liters.\n" +
				"19.0 gallons is 71.9226 liters.\n" +
				"20.0 gallons is 75.708 liters.\n" +
				"\n" +
				"21.0 gallons is 79.49340000000001 liters.\n" +
				"22.0 gallons is 83.2788 liters.\n" +
				"23.0 gallons is 87.0642 liters.\n" +
				"24.0 gallons is 90.84960000000001 liters.\n" +
				"25.0 gallons is 94.635 liters.\n" +
				"26.0 gallons is 98.4204 liters.\n" +
				"27.0 gallons is 102.2058 liters.\n" +
				"28.0 gallons is 105.9912 liters.\n" +
				"29.0 gallons is 109.7766 liters.\n" +
				"30.0 gallons is 113.562 liters.\n" +
				"\n";
		
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		//Act
		GalToLitTable.main(null);
		final String actual = myOut.toString();
		
		// Assert
		assertEquals( expected, actual );
	}

}
