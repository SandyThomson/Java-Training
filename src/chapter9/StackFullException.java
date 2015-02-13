package chapter9;

public class StackFullException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8480923124728147458L;

	public StackFullException() {
		System.out.println("Stack is full");
	}

}
