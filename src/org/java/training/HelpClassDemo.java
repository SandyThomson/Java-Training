package org.java.training;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Try This 4-1, separated out into menu entry type, container and builder.
 * Note that the menu type is also an entry type, so nested menus should be simple.
 */
public class HelpClassDemo {
	public static void main(String[] args) {
		Menu menu = conditionsMenu();
		try ( Scanner in = new Scanner( System.in ) ) {
			menuLoop( menu, in::nextLine );
		}
	}
	
	public static void menuLoop( Menu menu, Supplier<String> in ) {
		for ( String choice = null; !menu.quit( choice ); menu.eachEntry( choice, System.out::println ) ) {
			do {
				menu.description( System.out::println );
			} while( !menu.accepts( choice = in.get() ) );
		}
	}
	
	public static Menu conditionsMenu() {
		int i = 1;
		return new Menu( "Control Structures Help Menu", "q",
			MenuEntry.from( i++, "if", "The if:", "if ( condition ) statement;", "else statement" ),
			MenuEntry.from( i++, "switch", "The switch:",
				"switch ( expression ) {",
				"  case constant:",
				"    statement sequence",
				"    break;",
				"  //...", "}" ),
			MenuEntry.from( i++, "for", "The for:", "for ( init; condition; iteration )", "  statement;" ),
			MenuEntry.from( i++, "while", "The while:", "while ( condition ) statement;" ),
			MenuEntry.from( i++, "do-while", "The do-while:", "do {", "  statement;", "} while ( condition );" ),
			MenuEntry.from( i++, "break", "The break:", "break; or break label;" ),
			MenuEntry.from( i++, "continue", "The continue:", "continue; or continue label;" ) );
	}
}

class Menu implements MenuEntry {
	private final List<MenuEntry> entries;
	private final String label;
	private final String exitKey;
	
	Menu( String label, String exitKey, MenuEntry... entries ) {
		this.label = label;
		this.exitKey = exitKey;
		this.entries = Arrays.asList(entries);
	}

	public void description( Consumer<String> out ) {
		out.accept( "Help on:" );
		entries.stream().map( e -> e.label() ).forEachOrdered(out::accept);
		out.accept( String.format( "Choose one (%s to quit):", exitKey ) );
	}
	
	public String label() {
		return label;
	}
	
	public void eachEntry( String key, Consumer<String> out ) {
		entries.stream()
			.filter( e -> e.accepts(key) )
			.forEachOrdered( e -> e.description(out) );
	}
	
	public boolean accepts( String key ) {
		return entries.stream().anyMatch( e -> e.accepts(key) ) || exitKey.equals(key);
	}
	
	public boolean quit( String key ) {
		return exitKey.equals( key );
	}
}

interface MenuEntry {
	boolean accepts( String key );
	String label();
	void description( Consumer<String> out );
	
	static MenuEntry from( int index, String label, String... desc ) {
		return new MenuEntry() {
			public boolean accepts(String key) {
				return Stream.of( Integer.toString(index), label ).anyMatch(key::equals);
			}
			public String label() {
				return String.format( "  %s: %s", index, label );
			}
			public void description( Consumer<String> out ) {
				Stream.of(desc).forEachOrdered(out::accept);
			}
		};
	}
}