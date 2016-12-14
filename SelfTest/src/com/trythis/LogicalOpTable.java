package com.trythis;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class LogicalOpTable {

	private static final String[] HEADINGS = { "P", "Q", "AND", "OR", "XOR", "NOT" };
	
	private static final boolean[][] VALUES = { { true,  true  }, 
												{ true,  false }, 
												{ false, true  }, 
												{ false, false } };
	
	private static BiFunction<Boolean, Boolean, Stream<Boolean>> getValues = (p,q) -> Arrays.stream( new Boolean[] { p, q, (p&q), (p|q), (p^q), (!p) } );

	private static BiFunction<Boolean, Boolean, Stream<Integer>> getValuesAsInteger = getValues.andThen( bools -> bools.mapToInt( bool -> bool ? 1 : 0 ).boxed() );
	
	public static void main( String[] args ) {
		
		// Display true/false.
		System.out.println( Arrays.stream( HEADINGS ).reduce( (a, b) -> String.format( "%s\t%s", a, b ) ).get() );
		Arrays.stream( VALUES )
			.map( value -> getValues.apply( value[0], value[1] ) )
			.map( value -> String.format("%s\t%s\t%s\t%s\t%s\t%s", value.toArray() ) )
			.forEach( System.out::println );
		
		// Display 1/0.
		System.out.println( Arrays.stream( HEADINGS ).reduce( (a, b) -> String.format( "%s\t%s", a, b ) ).get() );
		Arrays.stream( VALUES )
			.map( value -> getValuesAsInteger.apply( value[0], value[1] ) )
			.map( value -> String.format("%s\t%s\t%s\t%s\t%s\t%s", value.toArray() ) )
			.forEach( System.out::println );
	}
}