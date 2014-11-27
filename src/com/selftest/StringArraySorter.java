package com.selftest;

public class StringArraySorter {

	public static String[] bubbleSort(String... strings) {

		int size = strings.length;

		for (int a = 1; a < size; a++) {
			for (int b = size - 1; b >= a; b--) {

				// Start off by ignoring case, and then only factor in case if
				// it might make a difference
				int compareToResult = strings[b - 1]
						.compareToIgnoreCase(strings[b]);

				if (compareToResult == 0) {
					compareToResult = strings[b - 1].compareTo(strings[b]);
				}

				if (compareToResult > 0) {
					String t = strings[b - 1];
					strings[b - 1] = strings[b];
					strings[b] = t;
				}
			}
		}

		return strings;

	}

}
