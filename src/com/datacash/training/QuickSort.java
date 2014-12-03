
package com.datacash.training;

public class QuickSort {

	public static void quickSort( char items[] ) {
		qSort( items, 0, items.length - 1 );
	}

	private static void qSort( char items[], int left, int right ) {
		int i = left;
		int j = right;

		char x, y;

		x = items[(left + right) / 2];

		do {
			while ( items[i] < x && i < right ) {
				i++;
			}
			while ( x < items[j] && j > left ) {
				j--;
			}

			if ( i <= j ) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		}
		while ( i <= j );

		if ( left < j ) {
			qSort( items, left, j );
		}
		if ( i < right ) {
			qSort( items, i, right );
		}
	}

}
