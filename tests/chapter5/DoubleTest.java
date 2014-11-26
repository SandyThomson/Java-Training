package chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleTest {

	@Test
	public void averageTest() {
		double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double expected = 5.5;
		
		double actual = Double.average(values);
		
		assertEquals( expected, actual, 0 );
	}

}
