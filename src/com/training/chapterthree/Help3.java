
package com.training.chapterthree;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Help3 {

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

	public static void main( String[] args ) throws IOException {

		System.out.println( "Help on:" );

		MAIN: while ( true ) {

			choices.stream().forEach( System.out::print );

			char ignore, input = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			}
			while ( ignore != '\n' );

			switch ( input ) {

				case '1':
					ifSyntax.stream().forEach( System.out::println );
					exitStatement.stream().forEach( System.out::println );
					break;
				case '2':
					switchSyntax.stream().forEach( System.out::println );
					exitStatement.stream().forEach( System.out::println );
					break;
				case '3':
					forSyntax.stream().forEach( System.out::println );
					exitStatement.stream().forEach( System.out::println );
					break;
				case '4':
					whileSyntax.stream().forEach( System.out::println );
					exitStatement.stream().forEach( System.out::println );
					break;
				case '5':
					doWhileSyntax.stream().forEach( System.out::println );
					exitStatement.stream().forEach( System.out::println );
					break;
				case '6':
					breakSyntax.stream().forEach( System.out::println );
					exitStatement.stream().forEach( System.out::println );
					break;
				case '7':
					continueSyntax.stream().forEach( System.out::println );
					exitStatement.stream().forEach( System.out::println );
					break;
				case 'q':
					break MAIN;
				default:
					invalidArg.stream().forEach( System.out::println );
					break;
			}
		}
	}

}
