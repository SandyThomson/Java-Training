package org.java.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

/**
 * Try it 2-2 challenge #6. Basically the same as LogicalOp, but composes an additional int map
 * to show the booleans as 0 or 1.
 */
public class LogicalOpZeroesAndOnes {
	private static final List<BinaryOperator<Boolean>> OPS = Arrays.<BinaryOperator<Boolean>>asList(
		(a, b) -> a & b,
		(a, b) -> a | b,
		(a, b) -> a ^ b,
		(a, b) -> !a );

	public static void main(String[] args) {
		BiFunction<Boolean, Boolean, Stream<Boolean>> boolOp =
			(a, b) -> concat( of(a, b), OPS.stream().map( o -> o.apply(a, b) ));

		BiFunction<Boolean, Boolean, Stream<Integer>> run =
				boolOp.andThen( s -> s.mapToInt(b -> b ? 1 : 0).boxed() );

		Arrays.asList( Arrays.asList( "P", "Q", "AND", "OR", "XOR", "NOT" ).stream(),
				run.apply(true, true),
				run.apply(true, false),
				run.apply(false, true),
				run.apply(false, false) ).stream().parallel()
			.map(s -> String.format("%-3s | %-3s | %-3s | %-3s | %-3s | %-3s", s.toArray()))
			.sequential().forEach(System.out::println);
	}
}
