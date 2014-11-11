package org.java.training;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Try-it 3-1
 *   Essentially the same as the book, but demonstrating try-with-resources,
 *   case fall-through and method references.
 */
public class ConditionHelp {

	public static void main(String[] args) {
		try ( Scanner in = new Scanner( System.in ) ) {
			help( in::nextLine, System.out::println );
		}
	}

	public static void help( Supplier<String> i, Consumer<String> o ) {
		o.accept( "Help on:" );
		o.accept( "  1. if" );
		o.accept( "  2. switch" );

		String choice = i.get();

		switch( choice.toLowerCase().trim() ) {
			case "1": 
			case "if":
				o.accept( "The if:\n" );
				o.accept( "if ( condition ) statement;" );
				o.accept( "else statement;" );
				break;

			case "2": 
			case "switch": 
				o.accept( "The switch:\n" );
				o.accept( "switch ( expression ) {" );
				o.accept( "  case constant:" );
				o.accept( "    statement sequence" );
				o.accept( "    break;" );
				o.accept( "  // ..." );
				o.accept( "}" );
				break;

			default:
				o.accept( "Selection not found." );
		}
	}
}
