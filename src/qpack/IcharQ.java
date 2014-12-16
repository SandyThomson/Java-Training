package qpack;

/**
 * A character queue interface
 * 
 * @author sdt
 *
 */
public interface IcharQ {

	/**
	 * Put a character onto the queue
	 * 
	 * @param ch
	 */
	void put(char ch);

	/**
	 * Get a character from the queue
	 * 
	 * @return
	 */
	char get();

	// My answer for Q15
	// This should 'empty' the queue (although in these implementations it's
	// just moving the queue pointer).
	default void reset() {
		while (get() != (char) 0);
	}

}
