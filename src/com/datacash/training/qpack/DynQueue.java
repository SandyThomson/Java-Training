
package com.datacash.training.qpack;

// A dynamic queue.
public class DynQueue implements IPresentQ {

	private Child q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices

	// Construct an empty queue given its size.
	public DynQueue( int size ) {
		q = new Child[size]; // allocate memory for queue
		putloc = getloc = 0;
	}

	// Put a child into the queue.
	@Override
	public void put( Child ch ) {
		if ( putloc == q.length ) {
			// increase queue size
			Child t[] = new Child[q.length * 2];

			// copy elements into new queue
			for ( int i = 0 ; i < q.length ; i++ )
				t[i] = q[i];

			q = t;
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
