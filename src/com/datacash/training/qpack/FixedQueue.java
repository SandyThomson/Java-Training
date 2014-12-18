
package com.datacash.training.qpack;

// A fixed-size queue class for children.
public class FixedQueue implements IPresentQ {

	private Child q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices

	// Construct an empty queue given its size.
	public FixedQueue( int size ) {
		q = new Child[size]; // allocate memory for queue
		putloc = getloc = 0;
	}

	// Put a child into the queue.
	@Override
	public void put( Child ch ) {
		if ( putloc == q.length ) {
			System.out.println( " -- Queue is full." );
			return;
		}

		q[putloc++] = ch;
	}

	// Get a child from the queue.
	@Override
	public Child get() {
		if ( getloc == putloc ) {
			System.out.println( " -- Queue is empty." );
			return null;
		}

		return q[getloc++];
	}
}
