package org.java.training;

import static java.util.stream.IntStream.*;

public class PrimeNumbers {
	public static void main(String[] args) {
		int limit = 100;

		range(2, limit).parallel()
			.filter(i -> !rangeClosed(2, i / 2).anyMatch( j -> i % j == 0 ) )
			.sequential().forEach(System.out::println);
	}
}
