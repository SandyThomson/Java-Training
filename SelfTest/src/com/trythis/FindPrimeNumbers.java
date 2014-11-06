package com.trythis;

import java.util.stream.IntStream;

public class FindPrimeNumbers {
	
	public static void main( String[] args ) {
		IntStream.range(2, 100).filter( i -> {
			return IntStream.rangeClosed(2, (int)Math.sqrt( i ) )
							.noneMatch( divisor -> i % divisor == 0 );
			} ).forEach( System.out::println );
	}
	
}