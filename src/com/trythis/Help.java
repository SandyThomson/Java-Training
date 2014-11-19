package com.trythis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Help {

	private static int[] VALID_CHARS = { '1', '2', '3', '4', '5', '6', '7' };
	
	private static enum TOPIC {
	    IF( "if", "if(condition) statement;\n"
	            + "else statement;" ),
				
	    SWITCH( "switch", "switch (expression) {\n"
                        + "  case constant:\n"
                        + "    statement sequence\n"
                        + "    break;\n"
                        + "  // ...\n"
                        + "}" ),
						
        FOR( "for", "for(init; condition; iteration)\n"
                  + "  statement;" ),
		
        WHILE( "while", "while(condition) statement;" ),
		
        DOWHILE( "do-while", "do {\n"
                           + "  statement;\n"
                           + "} while (condition);" ),
						   
        BREAK( "break", "break; or break label;" ),
		
		CONTINUE( "continue", "continue; or continue label;" );
		
		public final String name;
		public final String message;
		
		private TOPIC( String name, String message ) {
            this.name = name;
            this.message = message;
		}
	}
	
	private static final Map<Character, TOPIC> TOPICS;
	static {
		TOPICS = new HashMap<Character, TOPIC>();
		TOPICS.put( '1', TOPIC.IF );
		TOPICS.put( '2', TOPIC.SWITCH );
		TOPICS.put( '3', TOPIC.FOR );
		TOPICS.put( '4', TOPIC.WHILE );
		TOPICS.put( '5', TOPIC.DOWHILE );
		TOPICS.put( '6', TOPIC.BREAK );
		TOPICS.put( '7', TOPIC.CONTINUE );
	}
	
	public void helpOn( int what ) {
	    if ( isValid( what ) )
	        TOPICS.entrySet().stream()
                             .filter( entry -> entry.getKey() == what )
                             .map( entry -> String.format( "\nThe %s:\n%s\n", entry.getValue().name, entry.getValue().message ) )
                             .forEach( System.out::println );		
	}
	
	public void showMenu() {
	    System.out.println( "Help on:" );
	    TOPICS.entrySet().stream()
                         .map( entry -> String.format( "%s. %s", entry.getKey(), entry.getValue().name ) )
                         .forEach( System.out::println );
	    System.out.print( "Choose one (q to quit): " );		
	}
	
	private boolean isValid( int ch ) {
		return Arrays.stream( VALID_CHARS ).anyMatch( i -> i == ch );
	}
}
