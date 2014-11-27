
package com.datacash.training;

import java.util.Arrays;
import java.util.List;

public class Question4 {

	public static void main( String[] args ) {

		bubbleSortArray();

		bubbleSortList();

	}

	private static void bubbleSortArray() {

		String words[] = { "golf", "charlie", "november", "uniform", "tango", "echo", "sierra", "alpha", "whisky", "romeo" };

		String temp;
		int size = words.length;

		// Display original array
		System.out.println( "Original array is:" );
		for ( int n = 0 ; n < size ; n++ ) {
			System.out.print( " " + words[n] );
		}
		System.out.println();

		// bubble sort
		for ( int a = 1 ; a < size ; a++ ) {
			for ( int b = size - 1 ; b >= a ; b-- ) {
				if ( words[b - 1].compareTo( words[b] ) > 0 ) {
					temp = words[b - 1];
					words[b - 1] = words[b];
					words[b] = temp;
				}
			}
		}

		// Display sorted array
		System.out.println( "Sorted array is:" );
		for ( int n = 0 ; n < words.length ; n++ ) {
			System.out.print( " " + words[n] );
		}
		System.out.println();

	}

	private static void bubbleSortList() {
		List<String> words = Arrays.asList( "golf", "charlie", "november", "uniform", "tango", "echo", "sierra", "alpha", "whisky", "romeo" );

		String temp;

		// Display original list
		System.out.println( "Original list is:" );
		words.stream().map( s -> String.format( " %s", s ) ).forEach( System.out::print );
		System.out.println();

		// bubble sort
		for ( String value : words ) {
			for ( String value2 : words ) {

				int b = words.indexOf( value2 );

				if ( b + 1 == words.size() ) break;

				if ( words.get( b + 1 ).compareTo( words.get( b ) ) < 0 ) {
					temp = words.get( b + 1 );
					words.set( b + 1, words.get( b ) );
					words.set( b, temp );

				}
			}
		}

		// Display sorted list
		System.out.println( "Sorted list is:" );
		words.stream().map( s -> String.format( " %s", s ) ).forEach( System.out::print );
		System.out.println();
	}

}
