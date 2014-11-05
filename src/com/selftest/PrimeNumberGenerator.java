package com.selftest;

import static java.lang.Math.sqrt;

import java.util.ArrayList;

public class PrimeNumberGenerator {

	/**
	 * Takes a range, returns a list of prime numbers in that range
	 * 
	 * @param start
	 *            of range
	 * @param end
	 *            of range
	 * @return list of primes
	 */
	public static ArrayList<Integer> getPrimeNumbersForRange(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<>();

		// For now, lets /assume/ both values are positive integers. In the real
		// world we'd validate this.

		for (int potentialPrime = start; potentialPrime <= end; potentialPrime++) {
			if (isPrime(potentialPrime)) {
				primes.add(potentialPrime);
			}
		}

		return primes;

	}

	/**
	 * This is not as efficient as it could be ...
	 * 
	 * @param potentialPrime
	 *            The candidate integer to test
	 * @return whether it is prime (or not)
	 */
	private static boolean isPrime(int potentialPrime) {

		if (potentialPrime % 2 == 0)
			return false;

		for (int x = 3; x <= sqrt(potentialPrime); x++) {
			if (potentialPrime % x == 0)
				return false;
		}

		return true;
	}
}