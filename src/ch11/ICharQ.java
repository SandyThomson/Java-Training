package ch11;


// A character queue interface that throws exceptions.
public interface ICharQ {

	// Put a characer into the queue.     
	void put( char ch ) throws QueueFullException;

// Get a character from the queue.    
	char get() throws QueueEmptyException;
}