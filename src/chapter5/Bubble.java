package chapter5;

class Bubble {
	public static void main(String args[]) {
		String values[] = { "delta", "bravo", "echoed", "epsilon", "alpha",
				"foxtrot", "delta", "echo" };
		int a, b;
		String t;

		// display original array
		System.out.print("Original array is:");
		for (int i = 0; i < values.length; i++)
			System.out.print(" " + values[i]);
		System.out.println();

		// This is the bubble sort.
		for (a = 1; a < values.length; a++)
			for (b = values.length - 1; b >= a; b--) {

				if (values[b - 1].compareTo(values[b]) > 0) { // if out
																// of
																// order
					// exchange elements
					t = values[b - 1];
					values[b - 1] = values[b];
					values[b] = t;
				}
			}

		// display sorted array
		System.out.print("Sorted array is:");
		for (int i = 0; i < values.length; i++)
			System.out.print(" " + values[i]);
		System.out.println();
	}
}
