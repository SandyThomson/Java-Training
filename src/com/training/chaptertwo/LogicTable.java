
package com.training.chaptertwo;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class LogicTable {

	public static void main( String[] args ) {

		// Each BiFunction returns a stream containing the output of the operations for each input
		BiFunction<Boolean, Boolean, Stream<Object>> boolOp = ( a, b ) -> Arrays.asList( new Object[]{ a, "\t", b, "\t", a & b, "\t", a | b, "\t", a ^ b, "\t", !a, "\n" } ).stream();
		BiFunction<Integer, Integer, Stream<Object>> intOp = ( a, b ) -> Arrays.asList( new Object[]{ a, "\t", b, "\t", a & b, "\t", a | b, "\t", a ^ b, "\t", a == 1 ? 0 : 1, "\n" } ).stream();

		//Print header
		System.out.println( "p\tq\tAND\tOR\tXOR\tNOT" );

		// Concatenate each stream and print
		Stream.concat( boolOp.apply( true, true ), Stream.concat( boolOp.apply( true, false ), Stream.concat( boolOp.apply( false, true ), boolOp.apply( false, false ) ) ) ).forEach( System.out::print );

		//Print header
		System.out.println();
		System.out.println( "p\tq\tAND\tOR\tXOR\tNOT" );

		// Concatenate each stream and print
		Stream.concat( intOp.apply( 1, 1 ), Stream.concat( intOp.apply( 1, 0 ), Stream.concat( intOp.apply( 0, 1 ), intOp.apply( 0, 0 ) ) ) ).forEach( System.out::print );

	}

}
