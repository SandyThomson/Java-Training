/**
 * 
 */
package main.java;

import java.util.Random;

/**
 * @author Mike
 *
 */
public class Stack<T> {

	private T[] stack;
	private int topIndex = -1;

	public Stack(int size) {
		// Apparently this gets around issues creating an array of type T
		stack = (T[]) new Object[size];
	}

	public static void main(String... args) {
		Stack<Character> stack = new Stack<Character>(10);
		Random random = new Random();

		// max out the stack with characters between a-z
		while (stack.push((char) (random.nextInt(26) + 'a')))
			;

		Character ch;
		while ((ch = stack.pop()) != null) {
			System.out.print(ch);
		}
		System.out.println("\nEnd of stack");
	}

	/**
	 * 
	 * Adds something from the stack
	 * @param toAdd
	 *            The item to add to the list
	 * @return true if the item was added. false if the stack is full.
	 */
	public boolean push(T toAdd) {
		if (topIndex + 1 < stack.length) {
			stack[++topIndex] = toAdd;
			return true;
		}
		return false;
	}

	/**
	 * Removes something from the stack
	 * @return the top item in the stack or null if the stack is empty.
	 */
	public T pop() {
		if (topIndex > -1) {
			return stack[topIndex--];
		}
		return null;
	}

}
