package com.datacash.training.chapter11;

//A fixed-size queue class for Tasks
public class Queue {

	private Task q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices

	// Construct an empty queue given its size.
	public Queue(int size) {
		q = new Task[size]; // allocate memory for queue
		putloc = getloc = 0;
	}

	// Put a Task into the queue.
	public synchronized void put(Task task) {
		if (putloc == q.length) {
			System.out.println(" -- Queue is full.");
			return;
		}
		q[putloc++] = task;
		notifyAll();
	}

	// Get a Task from the queue.
	public synchronized Task get() {
		if ( getloc == q.length ) {
			System.out.println( "End of queue reached, no more tasks" );
			return null;
		}
		else if (getloc == putloc) {
			try {
				System.out.println( "Queue empty, waiting for task" );
				wait();		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return q[getloc++];
	}
}
