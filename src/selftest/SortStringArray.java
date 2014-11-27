package selftest;

public class SortStringArray {

	public static void main(String args[]) {
		String strings[] = { "mary", "had", "a", "little", "lamb", "she", "tied", "it", "to", "a", "pylon" };
		int a, b, size;
		String t;

		size = strings.length; // number of elements to sort

		// display original array
		System.out.print("Original array is:");
		for (int i = 0; i < size; i++)
			System.out.print(" " + strings[i]);
		System.out.println();

		// This is the Bubble sort.
		for (a = 1; a < size; a++)
			for (b = size - 1; b >= a; b--) {
				if (strings[b - 1].compareTo(strings[b]) > 0) { // if out of order
					// exchange elements
					t = strings[b - 1];
					strings[b - 1] = strings[b];
					strings[b] = t;
				}
			}
		// display sorted array
		System.out.print("Sorted array is:");
		for (int i = 0; i < size; i++)
			System.out.print(" " + strings[i]);
		System.out.println();
	}
}