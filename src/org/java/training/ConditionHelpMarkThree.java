package org.java.training;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Try-it 3-3.
 */
public class ConditionHelpMarkThree {

	public static void main(String[] args) {
		try ( Scanner in = new Scanner( System.in ) ) {
			help( in::nextLine, System.out::println );
		}
	}
	
	public static void help( Supplier<String> i, Consumer<String> o ) {
		for ( ; ; ) {
			MenuOption.menu(o);
			String choice = i.get();

			MenuOption menuOpt;
			if ( ( menuOpt = MenuOption.getOpt( choice ) ) != null ) {
				menuOpt.writer.accept(o);
			}
			else if ( "q".equals( choice ) )
				break;
		}
	}

	public enum MenuOption {
		IF( "1. if", o -> {
			o.accept( "The if:\n" );
			o.accept( "if ( condition ) statement;" );
			o.accept( "else statement;" );
			}, "1", "if" ),
		
		SWITCH( "2. switch", o -> {
			o.accept( "The switch:\n" );
			o.accept( "switch ( expression ) {" );
			o.accept( "  case constant:" );
			o.accept( "    statement sequence" );
			o.accept( "    break;" );
			o.accept( "  // ..." );
			o.accept( "}" );
			}, "2", "switch" ),
			
		FOR( "3. for", o -> {
			o.accept( "The for:\n" );
			o.accept( "for ( init; condition; iteration )" );
			o.accept( "  statement;" );	
			}, "3", "for" ),
		
		WHILE( "4. while", o -> {
			o.accept( "The while:\n" );
			o.accept( "while ( condition ) statement;" );
			}, "4", "while" ),
			
		DO_WHILE( "5. do-while", o -> {
			o.accept( "The do-while:\n" );
			o.accept( "do {" );
			o.accept( "  statement;" );
			o.accept( "} while ( condition );" );
			}, "5", "do-while", "do" ),

		BREAK( "6. break", o -> {
			o.accept( "The break:\n" );
			o.accept( "break; or break label;" );
			}, "6", "break" ),
		
		CONTINUE( "7. continue", o -> {
			o.accept( "The continue:\n" );
			o.accept( "continue; or continue label;" );
			}, "7", "continue" );
		
		private static final Map<String, MenuOption> OPTIONS = new HashMap<>();
		static {
			Arrays.stream( values() )
				.forEach( opt -> Arrays.stream( opt.accepts )
						.forEach( val -> OPTIONS.put( val, opt ) ) );
		}

		public final Consumer<Consumer<String>> writer;
		private final String desc;
		private final String[] accepts;
		
		/**
		 * @param desc Description of option for display in choice menu
		 * @param writer Function to write to output
		 * @param accepts Zero or more keys to dispatch from
		 */
		private MenuOption ( String desc, Consumer<Consumer<String>> writer, String... accepts ) {
			this.writer = writer;
			this.desc = desc;
			this.accepts = accepts;
		}
				
		public static void menu( Consumer<String> o ) {
			o.accept( "Help on:" );
			Arrays.stream(values()).forEach( option -> o.accept( "  " + option.desc ) );
			
			o.accept( "Choose one (q to quit):" );
		}
		
		public static MenuOption getOpt( String opt ) {
			return OPTIONS.get( opt == null ? null : opt.toLowerCase().trim() );
		}
	}
}
