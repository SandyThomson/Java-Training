
package com.training.chapter1;

import java.util.Arrays;

public class HelloJava8 {

	public static void main( String args[] ) {
		Arrays.asList( new String[]{ "Hello ", "Java ", "8!" } ).stream().forEach( System.out::print );
	}
}
