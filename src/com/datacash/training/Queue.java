
package com.datacash.training;


public class Queue {

	private char queue[];
	private int end;

	public Queue( int size ) {
		queue = new char[size];
		end = 0;
	}

	public void put( char ch ) {
		if ( end == queue.length ) {
			System.out.println( " - Queue is full!" );
			return;
		}

		queue[end++] = ch;
	}

	public char get() {
		if ( end == 0 ) {
			System.out.println( " - Queue is empty!" );
			return (char) 0;
		}

		char result = queue[0];

		for ( int i = 0 ; i < queue.length ; i++ ) {
			if ( i == queue.length - 1 ) {
				queue[i] = 0;
			}
			else {
				queue[i] = queue[i + 1];
			}
		}

		end--;
		return result;
	}

}
