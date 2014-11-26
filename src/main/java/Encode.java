/**
 * 
 */
package main.java;

import java.util.Scanner;

/**
 * @author Mike
 *
 */
public class Encode {
	public static String KEY = "Blarg Blarg Honk";

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a message to encode:");

		String message = scanner.nextLine();
		scanner.close();


		String encoded = encodeAndDecode(message, KEY);
		System.out.println("Encoded message:\n" + encoded);

		String decoded = encodeAndDecode(encoded, KEY);
		System.out.println("Decoded message:\n" + decoded);

	}

	public static String encodeAndDecode(String text, String key) {
		StringBuilder sb = new StringBuilder();
		int keyIndex = 0;
		char[] letters = text.toCharArray();
		for (char letter : letters) {
			sb.append((char) (letter ^ key.charAt(keyIndex)));
			keyIndex = (keyIndex + 1 < key.length()) ? ++keyIndex : 0;
		}

		return sb.toString();
	}

}
