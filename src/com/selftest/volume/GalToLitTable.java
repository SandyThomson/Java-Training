package com.selftest.volume;

/*
 * I just ripped this one from the book and renamed the variables and changed the values.
 * Laziness FTW.
 */
class GalToLitTable {
	public static void main(String args[]) {
		double inches, metres;
		int counter;

		counter = 0;
		for (inches = 1; inches <= 12 * 12; inches++) {
			metres = inches / 39.37;
			System.out.println(inches + " inches is " + metres + " metres.");

			counter++;
			// every 12th line, print a blank line
			if (counter == 12) {
				System.out.println();
				counter = 0; // reset the line counter
			}
		}
	}
}