
package com.datacash.training;

public class Question7 {

	public static void main( String[] args ) {

		String msg = "This is a test";
		StringBuilder encMsg = new StringBuilder();
		StringBuilder decMsg = new StringBuilder();
		String key = "randolol";

		System.out.print( "Original message: " );
		System.out.println( msg );

		msg.chars().forEach( ( ch ) -> encMsg.append( (char) (ch ^ key.charAt( msg.indexOf( ch ) % 8 )) ) );

		System.out.print( "Encoded message: " );
		System.out.println( encMsg );

		encMsg.chars().forEach( ( ch ) -> decMsg.append( (char) (ch ^ key.charAt( encMsg.indexOf( Character.toString( (char) ch ) ) % 8 )) ) );

		System.out.print( "Decoded message: " );
		System.out.println( decMsg );
	}

}
