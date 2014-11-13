package com.selftest;

import java.io.IOException;

public class SpaceCounter {

	public static void main(String... args) throws IOException {

		System.out
				.println("Please enter some characters followed by a line break. Type '.' anywhere in the line to stop");

		int spaceCount = 0;

		/*
		 * Note that system.in.read doesn't really cope with encoding. If using
		 * Unicode, we'd want to define the character set /I think/
		 */
		int byteChar = ' '; // Initially set this to something other than '.'
		while (byteChar != '.') {
			byteChar = System.in.read();
			if (byteChar == ' ') {
				spaceCount++;
			}

		}

		System.out.println("I saw " + spaceCount
				+ " spaces before encountering the first period '.'");

	}
}
