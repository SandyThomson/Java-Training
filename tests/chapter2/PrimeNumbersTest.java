/**
 * 
 */
package chapter2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Andy.Diack
 *
 */
public class PrimeNumbersTest {

	@Test
	public void testFindPrimeNumbersUpToAHundred() {
		int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		Object[] actual = PrimeNumbers.findPrimeNumbersUpToAHundred();
		
		for ( int i = 0; i < expected.length; i++ ) {
			assertEquals( expected[i], actual[i] );
		}
	}

}
