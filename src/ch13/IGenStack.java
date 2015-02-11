package ch13;

public interface IGenStack<T> {

	void push( T o ) throws StackFullException;

	T pop() throws StackEmptyException;
}
