/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public class MikeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3141592;

	/**
	 * 
	 */
	public MikeException() {

	}

	/**
	 * @param message
	 */
	public MikeException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public MikeException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MikeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MikeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
