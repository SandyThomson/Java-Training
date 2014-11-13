package com.selftest;

import java.io.IOException;
import java.util.Scanner;

public class CharacterCaseChanger {

	public static void main(String... args) throws IOException {

		System.out
				.println("Please enter some characters followed by a line break. Type '.' anywhere in the line to stop");

		int transformationCount = 0;

		Scanner s = new Scanner(System.in);

		LINELOOP: while (s.hasNext()) {
			String str = s.nextLine();

			for (int i = 0; i < str.length(); i++) {
				Character c = str.charAt(i);

				if (Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
					transformationCount++;
				} else if (Character.isLowerCase(c)) {
					c = Character.toUpperCase(c);
					transformationCount++;
				}

				System.out.print(c);

				if (c == '.') {
					break LINELOOP;
				}

			}

			System.out.println();
		}

		System.out.println();

		System.out.println("I made " + transformationCount
				+ " case changes before encountering the first period '.'");

	}
}
