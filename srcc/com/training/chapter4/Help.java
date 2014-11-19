
package com.training.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Help {

	private static final List<String> ifSyntax;
	private static final List<String> switchSyntax;
	private static final List<String> forSyntax;
	private static final List<String> whileSyntax;
	private static final List<String> doWhileSyntax;
	private static final List<String> breakSyntax;
	private static final List<String> continueSyntax;
	private static final List<String> invalidArg;
	private static final List<String> exitStatement;
	private static final List<String> choices;

	static {
		ifSyntax = Arrays.asList( "The if:\n", "if(condition) statement'",
		    "else statement;" );
		forSyntax = Arrays.asList( "The switch:\n",
		    "for(init; condition; iteration) statement;" );
		whileSyntax = Arrays.asList( "The while:\n",
		    "while(condition) statement;" );
		breakSyntax = Arrays.asList( "The while:\n", "break; or break label;" );
		continueSyntax = Arrays.asList( "The continue:\n",
		    "continue; or continue label;" );
		doWhileSyntax = Arrays.asList( "The do-while:\n", "do{", "  statement",
		    "while(condition);" );
		switchSyntax = Arrays.asList( "The for:\n", "switch(expression) {",
		    "  case constant:", "    statment sequence", "    break",
		    "//...", "}" );
		invalidArg = Arrays.asList( "\nInvalid character",
		    "Choose one of the below:" );
		exitStatement = Arrays.asList( "\nChoose another option:" );
		choices = Arrays.asList( "  1. if\n", "  2. switch\n", "  3. for\n",
		    "  4. while\n", "  5. do-while\n", "  6. break\n",
		    "  7. continue\n", "  q. exit\n", "Choose one:" );
	}

	public static void printChoices() {
		choices.stream().forEach( System.out::print );
	}

	public static boolean printOption( char option ) {

		switch ( option ) {

			case '1':
				Stream.concat( ifSyntax.stream(), exitStatement.stream() ).forEach( System.out::println );
				break;
			case '2':
				Stream.concat( switchSyntax.stream(), exitStatement.stream() ).forEach( System.out::println );
				break;
			case '3':
				Stream.concat( forSyntax.stream(), exitStatement.stream() ).forEach( System.out::println );
				break;
			case '4':
				Stream.concat( whileSyntax.stream(), exitStatement.stream() ).forEach( System.out::println );
				break;
			case '5':
				Stream.concat( doWhileSyntax.stream(), exitStatement.stream() ).forEach( System.out::println );
				break;
			case '6':
				Stream.concat( breakSyntax.stream(), exitStatement.stream() ).forEach( System.out::println );
				break;
			case '7':
				Stream.concat( continueSyntax.stream(), exitStatement.stream() ).forEach( System.out::println );
				break;
			case 'q':
				return false;
			default:
				invalidArg.stream().forEach( System.out::println );
				break;
		}

		return true;
	}

}
