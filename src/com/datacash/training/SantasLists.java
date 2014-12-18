
package com.datacash.training;

import com.datacash.training.qpack.Child;
import com.datacash.training.qpack.CircularQueue;
import com.datacash.training.qpack.DynQueue;
import com.datacash.training.qpack.FixedQueue;
import com.datacash.training.qpack.IPresentQ;

// Demonstrate the ICharQ interface.
class SantasLists {

	public static void main( String args[] ) {
		FixedQueue q1 = new FixedQueue( 10 );
		DynQueue q2 = new DynQueue( 5 );
		CircularQueue q3 = new CircularQueue( 10 );

		IPresentQ iQ;

		Child ch;
		int i;

		iQ = q1;
		// Put some children into fixed queue.
		for ( i = 0 ; i < 10 ; i++ )
			iQ.put( new Child( i, Math.random() ) );

		// Show the queue.
		System.out.println( "Contents of fixed Santa's list: " );
		for ( i = 0 ; i < 10 ; i++ ) {
			ch = iQ.get();
			System.out.println( ch.getPresent() );
		}
		System.out.println();

		iQ = q2;
		// Put some children into dynamic queue.
		for ( i = 0 ; i < 10 ; i++ )
			iQ.put( new Child( i, Math.random() ) );

		// Show the queue.
		System.out.println( "Contents of dynamic Santa's list: " );
		for ( i = 0 ; i < 10 ; i++ ) {
			ch = iQ.get();
			System.out.println( ch.getPresent() );
		}

		System.out.println();

		iQ = q3;
		// Put some characters into circular queue.
		for ( i = 0 ; i < 10 ; i++ )
			iQ.put( new Child( i, Math.random() ) );

		// Show the queue.
		System.out.println( "Contents of circular Santa's list: " );
		for ( i = 0 ; i < 10 ; i++ ) {
			ch = iQ.get();
			System.out.println( ch.getPresent() );
		}

		System.out.println();

		// Put more characters into circular queue.
		for ( i = 10 ; i < 20 ; i++ )
			iQ.put( new Child( i, Math.random() ) );

		// Show the queue.
		System.out.println( "Contents of circular Santa's list: " );
		for ( i = 0 ; i < 10 ; i++ ) {
			ch = iQ.get();
			System.out.println( ch.getPresent() );
		}

		System.out.println( "\nStore and consume from" + " circular Santa's list." );

		// Use and consume from circular queue.
		for ( i = 0 ; i < 20 ; i++ ) {
			iQ.put( new Child( i + 20, Math.random() ) );
			ch = iQ.get();
			System.out.println( ch.getPresent() );
		}

	}

}
