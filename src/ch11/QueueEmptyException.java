package ch11;


// An exception for queue-empty errors.
public class QueueEmptyException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
public String toString() {
		return "\nQueue is empty.";
	}
}
