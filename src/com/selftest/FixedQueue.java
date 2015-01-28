package com.selftest;

//A fixed-size queue class for characters that uses exceptions. 
public class FixedQueue implements ICharQ {
	private char q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices

	// Construct an empty queue given its size.
	public FixedQueue(int size) {
		q = new char[size + 1]; // allocate memory for queue
		putloc = getloc = 0;
	}

	// Put a characer into the queue.
	public synchronized void put(char ch) throws QueueFullException {

		if (putloc == q.length - 1)
			throw new QueueFullException(q.length - 1);

		putloc++;
		q[putloc] = ch;
	}

	// Get a character from the queue.
	public synchronized char get() throws QueueEmptyException {

		if (getloc == putloc)
			throw new QueueEmptyException();

		getloc++;
		return q[getloc];
	}
}
