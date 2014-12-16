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

}
