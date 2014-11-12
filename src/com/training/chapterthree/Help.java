
package com.training.chapterthree;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Help {

	private static final List<String> ifSyntax;
	private static final List<String> switchSyntax;
	private static final List<String> invalidArg;
	private static final List<String> exitStatement;
	private static final List<String> choices;

	static {
		ifSyntax = Arrays.asList( "The if:\n", "if(condition) statement'",
		    "else statement;" );
		switchSyntax = Arrays.asList( "The switch:\n", "switch(expression) {",
		    "  case constant:", "    statment sequence", "    break",
		    "//...", "}" );
		invalidArg = Arrays.asList( "\nInvalid character",
		    "Choose one of the below:" );
		exitStatement = Arrays.asList( "\nChoose another option:" );
		choices = Arrays.asList( "  1. if\n", "  2. switch\n", "  3. exit\n",
		    "Choose one:" );
	}

	public static void main( String[] args ) throws IOException {

		System.out.println( "Help on:" );
		choices.stream().forEach( System.out::print );

		while ( !choice() );

	}

	private static boolean choice() throws IOException {

		switch ( (char) System.in.read() ) {

			case '1':
				ifSyntax.stream().forEach( System.out::println );
				exitStatement.stream().forEach( System.out::println );
				choices.stream().forEach( System.out::print );
				break;
			case '2':
				switchSyntax.stream().forEach( System.out::println );
				exitStatement.stream().forEach( System.out::println );
				choices.stream().forEach( System.out::print );
				break;
			case '3':
				return true;
			case '\n':
				break;
			case '\r':
				break;
			default:
				invalidArg.stream().forEach( System.out::println );
				choices.stream().forEach( System.out::print );
				break;
		}
		return false;
	}

}
