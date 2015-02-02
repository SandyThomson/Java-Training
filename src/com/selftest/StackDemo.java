
package com.selftest;

import java.util.stream.Collectors;

import com.selftest.stack.Stack;
import com.selftest.stack.StackEmptyException;
import com.selftest.stack.StackFullException;
import com.selftest.stack.StackImpl;

public class StackDemo {

	public static void main( String[] args ) {
		Stack<Character> stack = new StackImpl<Character>( 8 );
		try {
			for ( char c = 'a' ; c <= 'z' ; c++ )
				stack.push( c );
		}
		catch ( StackFullException e ) {
			System.out.printf( "%s: [%s]%n",
											   e.getMessage(),
											   stack.stream().map( c -> c.toString() ).collect( Collectors.joining( "," ) ) );
		}

		try {
			while ( true )
				stack.pop();
		}
		catch ( StackEmptyException e ) {
			System.out.printf( "%s: [%s]%n",
										     e.getMessage(),
										     stack.stream().map( c -> c.toString() ).collect( Collectors.joining( "," ) ) );
		}
	}

}
