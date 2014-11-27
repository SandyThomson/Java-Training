package org.java.training;

public class BadEncode {

	public static void main(String[] args) {
		String msg = "This is a test";
		String key = "*secret*";
		
		System.out.println("Original message: " + msg);
		
		StringBuilder enc = new StringBuilder(), dec = new StringBuilder();
		for(int i = 0, lim = key.length(); i < msg.length(); enc.append((char)( key.charAt(i % lim) ^ msg.charAt(i++) ) ) );
		
		System.out.println("Encoded message: " + enc);
		
		for(int i = 0, lim = key.length(); i < enc.length(); dec.append((char)( key.charAt(i % lim) ^ enc.charAt(i++) ) ) );
		
		System.out.println("Decoded message: " + dec);
	}
}
