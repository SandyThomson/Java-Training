package org.java.training;

import static java.util.stream.IntStream.iterate;

/**
 * Chapter 3 self test #9.
 *
 */
public class InfiniteBase2Progression {

	public static void main(String[] args) {
		iterate( 1, n -> n << 1 ).forEach(System.out::println);
	}

}
