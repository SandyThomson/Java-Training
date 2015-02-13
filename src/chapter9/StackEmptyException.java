package chapter9;

public class StackEmptyException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8940747433345773938L;

	public StackEmptyException() {
		System.out.println("Stack is empty");
	}

}
