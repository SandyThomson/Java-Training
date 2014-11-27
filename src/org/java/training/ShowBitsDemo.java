package org.java.training;

import static java.util.stream.Stream.*;

import java.util.stream.Collectors;

/**
 * Try-This 5-3
 *
 */
public class ShowBitsDemo {
	public static void main(String[] args) {
		ShowBits bits = new ShowBits(64);
		System.out.println(bits.bits(0xABCDEFEF3987f80L));
	}
}

class ShowBits {
	int places;
	
	public ShowBits(int places) {
		this.places = places;
	}
	
	public String bits(long val) {
		String bits = iterate(1L << places - 1, i -> i >>> 1).limit(places)
				.map(i -> (val & i) == i ? "1" : "0")
				.collect(Collectors.joining());
		
		StringBuilder str = new StringBuilder(bits);
		for( int i = 8; i < str.length(); str.insert(i, " "), i += 9 );
		return str.toString();
	}
	
}