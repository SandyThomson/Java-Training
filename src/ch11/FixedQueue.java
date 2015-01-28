package ch11;


// A fixed-size queue class for characters that uses exceptions.
class FixedQueue implements ICharQ {

	private char q[]; // this array holds the queue     
	private int putloc, getloc; // the put and get indices     

	//Construct an empty queue given its size.    
	public FixedQueue( int size ) {
		q = new char[size]; // allocate memory for queue     
		putloc = getloc = 0;
	}


	//Put a characer into the queue.     
	@Override
	public synchronized void put( char ch )
	    throws QueueFullException {

		if ( putloc == q.length )
		  throw new QueueFullException( q.length );

		q[putloc++] = ch;
	}

	//Get a character from the queue.    
	@Override
	public synchronized char get()
	    throws QueueEmptyException {

if ( getloc == putloc )
		  throw new QueueEmptyException();

		return q[getloc++];
	}
}

