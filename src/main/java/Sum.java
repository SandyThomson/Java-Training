/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sum of values 1-5 = " + sum(1, 2, 3, 4, 5));
	}

	public static int sum(int... args) {
		int res = 0;
		for (int i : args) {
			res += i;
		}
		return res;
	}
	

}
