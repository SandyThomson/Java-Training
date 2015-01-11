package com.selftest;

public class StackEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7878945821283361859L;

	public StackEmptyException() {
		super();
	}

	public StackEmptyException(String message) {
		super(message);
	}

	public StackEmptyException(Throwable cause) {
		super(cause);
	}

	public StackEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public StackEmptyException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
