package org.java.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/**
 * Try This 6-3
 *
 */
public class Sort {

	public static void main(String[] args) {
		String[] strings = { "Flame", "Bubblegum", "Lumpy Space", "Ghost", "Slime", "Breakfast", "Crab", "Wildberry" };
		
		Sorter sorter = new QuickSorter();

		sorter.sort(strings);
		Arrays.stream(strings).forEach(System.out::println);
		
		System.out.println();
		
		// Reverse alphabetical order
		sorter.sort(strings, (a, b) -> b.compareTo(a));
		Arrays.stream(strings).forEach(System.out::println);
	}

}

interface Sorter {
	<T> void sort(T[] items, Comparator<T> comparator);

	default <T extends Comparable<T>> void sort(T[] items) {
		sort(items, (a, b) -> a.compareTo(b));
	}

	static <T> void swap(T[] array, int a, int b) {
		T tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	static <T> BiConsumer<Integer, Integer> swapper(T[] array) {
		return (a, b) -> swap(array, a, b);
	}
}

/**
 * QuickSort implementation that naiively selects the middle of the partition as
 * the pivot.
 */
class QuickSorter implements Sorter {

	public <T> void sort(T[] items, Comparator<T> cmp) {
		sort(items, cmp, 0, items.length - 1);
	}

	private static <T> void sort(T[] ts, Comparator<T> cmp, int left, int right) {
		int a = left, b = right;
		T pivot = ts[(right + left) / 2];
		do {
			while (cmp.compare(ts[a], pivot) < 0 && a < right) ++a;
			while (cmp.compare(pivot, ts[b]) < 0 && b > left) --b;
			
			if( a <= b ) Sorter.swap(ts, a++, b--);
		} while (a <= b);
		
		if ( left < b ) sort(ts, cmp, left, b);
		if ( a < right ) sort(ts, cmp, a, right);
	}

}