
package chapter13;

import chapter9.StackEmptyException;
import chapter9.StackFullException;

interface Stack<T> {

	void push( T x ) throws StackFullException;

	T pop() throws StackEmptyException;
}
