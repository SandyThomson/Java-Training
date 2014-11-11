package org.java.training;

import static java.util.stream.IntStream.*;

/**
 * 'Nested Loops' section extra challenge.
 *
 * For the record, the efficiency in the inner loop the book asks for is likely
 * iterating up to i / 2, not the use of streams (Streams just look nicer
 * and better describe the intention of the code).
 */
public class FindFactSimpler {

	public static void main(String[] args) {
		rangeClosed( 2, 100 ).parallel().mapToObj( i -> {
			StringBuilder str = new StringBuilder( "Factors of " + i + ": " );
			rangeClosed( 2, i / 2 ).filter( j -> i % j == 0 )
				.forEach( j -> str.append( j + " " ) );
			return str;
		}).sequential().forEach(System.out::println);
	}

}
