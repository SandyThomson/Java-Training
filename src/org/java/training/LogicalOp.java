package org.java.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

/**
 * Try it 2-2. Written in an overly complicated way to demonstrate a couple of
 * Java 8 features.
 */
public class LogicalOp {
	private static final List<BinaryOperator<Boolean>> OPS = Arrays.<BinaryOperator<Boolean>>asList(
		(a, b) -> a & b,
		(a, b) -> a | b,
		(a, b) -> a ^ b,
		(a, b) -> !a );

	public static void main(String[] args) {
		BiFunction<Boolean, Boolean, Stream<Boolean>> run =
			(a, b) -> concat( of(a, b), OPS.stream().map( o -> o.apply(a, b) ));

		Arrays.asList( Arrays.asList( "P", "Q", "AND", "OR", "XOR", "NOT" ).stream(),
				run.apply(true, true),
				run.apply(true, false),
				run.apply(false, true),
				run.apply(false, false) ).stream().parallel()
			.map(s -> String.format("%-6s | %-6s | %-6s | %-6s | %-6s | %-6s", s.toArray()))
			.sequential().forEach(System.out::println);
	}
}
