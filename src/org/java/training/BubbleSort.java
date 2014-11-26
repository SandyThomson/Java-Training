package org.java.training;

import java.util.Arrays;
import java.util.function.Supplier;

public class BubbleSort {
	
	public static void sort(int[] ls) {
		for(int i = 1; i < ls.length; ++i)
			for( int j = ls.length - 1; j >= i; --j )
				if ( ls[j] < ls[j-1] ) {
					ls[j] ^= (ls[j-1] ^= ls[j]);
					ls[j-1] ^= ls[j];
				}
	}
	
	public static void main(String[] args) {
		int[] ls = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
		
		Supplier<String> listString = () -> Arrays.stream(ls).mapToObj(Integer::toString).reduce((a, b) -> a + ", " + b).get();
		
		System.out.printf("Original Array [%s]%n", listString.get() );
		
		sort(ls);
		
		System.out.printf("Sorted Array [%s]%n", listString.get() );
	}

}
