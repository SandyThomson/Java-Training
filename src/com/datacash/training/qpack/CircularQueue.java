
package com.datacash.training.qpack;

// A circular queue.
public class CircularQueue implements IPresentQ {

	private Child q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices

	// Construct an empty queue given its size.
	public CircularQueue( int size ) {
		q = new Child[size + 1]; // allocate memory for queue
		putloc = getloc = 0;
	}

	// Put a child into the queue.
	@Override
	public void put( Child ch ) {
		/*
		 * Queue is full if either putloc is one less than getloc, or if putloc
		 * is at the end of the array and getloc is at the beginning.
		 */
		if ( putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0)) ) {
			System.out.println( " -- Queue is full." );
			return;
		}

		q[putloc++] = ch;
		if ( putloc == q.length )
		  putloc = 0; // loop back

	}

	// Get a child from the queue.
	@Override
	public Child get() {
		if ( getloc == putloc ) {
			System.out.println( " -- Queue is empty." );
			return null;
		}

		Child ch = q[getloc++];
		if ( getloc == q.length )
		  getloc = 0; // loop back
		return ch;
	}
}
