package org.java.training;

import static java.util.stream.IntStream.rangeClosed;

public class InchesToMetersFunWay {
	public static void main(String[] args) {
		rangeClosed(1, 144)
			.mapToObj(i -> String.format("%8d | %.4f" + ( i % 12 == 0 ? "%n" : "" ), i, i / 39.37) )
			.forEach(System.out::println);
	}
}
