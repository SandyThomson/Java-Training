package com.trythis;

import java.io.IOException;

public class HelpClassDemo {

	public static void main( String[] args ) throws IOException {
		Help help = new Help();
		
		char choice;
		do {
			help.showMenu();
			
			choice = (char)System.in.read();
			while ( System.in.read() != '\n' );
			
			help.helpOn( choice );	
		} while ( choice != 'q' );
	}
}
