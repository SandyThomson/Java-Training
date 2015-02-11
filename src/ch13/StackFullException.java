package ch13;

public class StackFullException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Stack is full.";
	}
}
