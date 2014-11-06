package com.trythis;

public class Sound {

	private static final int SPEED_OF_SOUND = 1100; // Feet per second.
	
	private static double calculateDistance( double time ) {
		return ( time * SPEED_OF_SOUND );
	}
	
	public static void main( String[] args ) {
		double timeInterval = 7.2;
		System.out.println( String.format( "The lightning is %.2f feet away.", calculateDistance( timeInterval ) ) );
		
		double echoTimeInterval = 14.4;
		System.out.println( String.format( "The large object is %.2f feet away.", calculateDistance( echoTimeInterval / 2 ) ) );
	}
}