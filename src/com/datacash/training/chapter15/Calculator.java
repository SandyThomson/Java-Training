package com.datacash.training.chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Calculator {

	private static final List<String> MENU = Arrays.asList( "Please select an option:", "1) Start new calculation", "2) Quit" ) ;
	
	public static void main( String[] args ) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calculation calc = new Calculation();
		System.out.println( "Welcome to the calculator!");
		System.out.println();
		
		int input = 0;
		
		while ( input != 2 ) {
			MENU.stream().forEach( System.out::println );

			try {
	      input = Integer.parseInt( br.readLine() );
				System.out.println();

	      if ( input == 1 ) { 
	      	calc.setValue( 0 );
	      	calc.process();
	    		System.out.println( "Final value: " + calc.getValue() );
	    		System.out.println();
	      }
	      
      }
      catch ( IOException e ) {
      	System.out.println( "IO failure!" );
      	break;
      } 
			catch (NumberFormatException nfe) {
      	System.out.println( "Not a number! Please try again!" );
      	continue;
      }
		}
		System.out.println( "Thank you for using the calculator!");

	}

}
