/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 *
 *         This will sort an array of Strings, using methods that don't
 *         necessarily need to be Strings.
 */
public class StringSorter {

	public static void main(String... args) {
		String[] words = { "Afterguard", "Sciatical", "Clung", "Equinoctially",
				"Hamate", "Pleonasm", "Jacksaw", "Silty", "Censurable", "Apart" };

		sorter(words);

	}

	/**
	 * This will sort an array of objects that implement the Comparable
	 * interface.
	 * 
	 * @param toSort
	 *            An array of objects to sort
	 */
	@SafeVarargs
	public static <T extends Comparable<T>> void sorter(T... toSort) {
		System.out.println("Original Array:");
		printer(toSort);

		T temp;

		int size = toSort.length;
		for (int x = 1; x < size; x++) {
			for (int y = size - 1; y >= x; y--) {
				if (toSort[y - 1].compareTo(toSort[y]) > 0) {
					temp = toSort[y - 1];
					toSort[y - 1] = toSort[y];
					toSort[y] = temp;
				}
			}
		}

		System.out.println("After sorting:");
		printer(toSort);
	}

	/**
	 * This will loop through an array and print each element separated by a
	 * space.
	 * 
	 * @param toPrint
	 *            An array object print out
	 */
	@SafeVarargs
	public static <T extends Object> void printer(T... toPrint) {

		for (T item : toPrint) {
			System.out.print(" " + item.toString());
		}
		System.out.print("\n");
	}
}
