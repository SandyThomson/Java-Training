/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public class StringFlipper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Blarg Blarg Honk - " + flip("Blarg Blarg Honk"));
	}

	public static String flip(String toFlip) {
		if ((null == toFlip) || (toFlip.length() <= 1)) {
			return toFlip;
		}
		return flip(toFlip.substring(1)) + toFlip.charAt(0);
	}

}
