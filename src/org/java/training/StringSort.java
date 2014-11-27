package org.java.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StringSort {
	
	public static void main(String[] args) {
		String[] message = { "This", "is", "an", "array", "of", "strings", "sort", "them", "please.", "I'll", "wait..." };
		Supplier<String> join = () -> Arrays.stream(message).collect(Collectors.joining(" "));

		Sorter sorter = new BubbleSorter();
		
		// default sort:
		sorter.sort(message);
		System.out.println( join.get() );
		
		// case-insensitive sort:
		sorter.sort(message, String.CASE_INSENSITIVE_ORDER);
		System.out.println( join.get() );
		
		// No-op sort:
		sorter.sort(message, (a, b) -> 0);
		System.out.println( join.get() );
	}

}

/**
 * In-place array sorting algorithms.
 */
interface Sorter {
	<T> void sort( T[] items, Comparator<T> comparator );

	default <T extends Comparable<T>> void sort( T[] items ) {
		sort( items, (a, b) -> a.compareTo(b) );
	}

	default <T> BiConsumer<Integer, Integer> swapper( T[] array ) {
		return (a, b) -> {
			T tmp = array[a];
			array[a] = array[b];
			array[b] = tmp;
		};
	}
}

/**
 * Simple bubble sort implementation. O(n^2)
 */
class BubbleSorter implements Sorter {
	public <T> void sort( T[] items, Comparator<T> comparator ) {
		BiConsumer<Integer, Integer> swap = swapper(items);
		
		for(int i = 1; i < items.length; ++i)
			for( int j = items.length - 1; j >= i; --j )
				if ( comparator.compare(items[j], items[j-1]) < 0 )
					swap.accept(j, j-1);
	}
}

/**
 * Simple selection sort implementation. O(n^2)
 */
class SelectionSorter implements Sorter {
	public <T> void sort( T[] items, Comparator<T> comparator ) {
		BiConsumer<Integer, Integer> swap = swapper(items);

		for(int i = 0, min = 0; i < items.length-1; min = ++i) {
			for(int j = i + 1; j < items.length; ++j)
				if( comparator.compare(items[min], items[j]) > 0 ) min = j;
			if (min != i) swap.accept(i, min);
		}
	}	
}

/**
 * Typical merge-sort implementation. Extra space requirements to
 * get O(n log n), vs O(n log^2 n) for an in-place variation.
 */
class MergeSorter implements Sorter {
	public <T> void sort(T[] items, Comparator<T> comparator) {
		List<T> merged = range(Arrays.asList(items), comparator);
		for(int i = 0; i < items.length; items[i] = merged.get(i), ++i);
	}
	
	private static <T> List<T> range(List<T> in, Comparator<T> cmp) {
		if ( in.size() < 2 ) return in;
		int mid = in.size() / 2;
		List<T> left = range(in.subList(0, mid), cmp);
		List<T> right = range(in.subList(mid, in.size()), cmp);
		return merge(left, right, cmp);
	}
	
	private static <T> List<T> merge(List<T> a, List<T> b, Comparator<T> cmp) {
		List<T> c = new ArrayList<T>(a.size() + b.size());
		int l = 0, r = 0;
		while ( l < a.size() && r < b.size() )
			c.add( cmp.compare(a.get(l), b.get(r)) > 0 ? b.get(r++) : a.get(l++) );
		while( l < a.size() ) c.add(a.get(l++));
		while( r < b.size() ) c.add(b.get(r++));
		return c;
	}
}

/**
 * Bogosort implementation. Average O((n + 1)!). Worst case unbounded.
 */
class BogoSorter implements Sorter {
	private static final Random RAND = new Random();

	public <T> void sort( T[] items, Comparator<T> comparator ) {
		if ( items.length < 2 ) return;

		BiConsumer<Integer, Integer> swap = swapper(items);
		while(!sorted(items, comparator)) {
			for( int i = 0; i < items.length -1 ; swap.accept(i, RAND.nextInt(items.length - i) + i), ++i );
		}
	}
	
	private static <T> boolean sorted( T[] items, Comparator<T> cmp ) {
		for(int i = 1; i < items.length; ++i)
			if ( cmp.compare(items[i], items[i-1]) < 0 ) return false;
		return true;
	}
	
}