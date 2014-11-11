package org.java.training;

import java.io.IOException;

/**
 *
 * Chapter 3 self test #1. Opted for a minimal approach because defining
 * java.util.stream.Stream.generate with an infinite character reader predicated
 * on a space was too much of a hassle. 
 *
 */
public class SpaceCounter {

	public static void main(String[] args) throws IOException {
		int count = 0;
		for ( char c = 0; c != '.'; c = (char) System.in.read(), count = c == ' ' ? ++count : count );
		System.out.printf( "Found %d spaces in the supplied input.", count );
	}

}
