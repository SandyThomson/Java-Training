package com.datacash.training;


public class QDemo {

	public static void main( String[] args ) {
	
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);

		// Store alphabet
		System.out.println("Using bigQ to store the alphabet");
		for(int i = 0; i < 26 ; i++) {
			bigQ.put( (char) ( 'A' + i) );
		}
		
		// Print using get
		System.out.println("Contents of bigQ");
		for(int i = 0; i < 26 ; i++) {
			char ch = bigQ.get();
			if ( ch != (char) 0 ){
				System.out.print( ch );
			}
		}

		System.out.println("\n");

		//
		System.out.println("Using smallQ to generate errors");
		for(int i = 0; i < 5 ; i++) {
			char ch = (char) ( 'Z' - i);
			
			System.out.println( "Attempting to print " + ch );
			smallQ.put( ch );
			System.out.println();
		}
		
		// Print using get
		System.out.println("Contents of smallQ:");
		for(int i = 0; i < 5 ; i++) {
			char ch = smallQ.get();
			if ( ch != (char) 0 ){
				System.out.println( "Got " + ch );
			}
		}
		
	}

}
