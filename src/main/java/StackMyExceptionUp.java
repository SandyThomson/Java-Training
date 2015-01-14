/**
 * 
 */
package main.java;

import java.util.Random;

/**
 * @author Mike
 *
 */
public class StackMyExceptionUp<T> {

	private T[] stack;
	private int topIndex = -1;

	public StackMyExceptionUp(int size) {
		// Apparently this gets around issues creating an array of type T
		stack = (T[]) new Object[size];
	}

	public static void main(String... args) {
		StackMyExceptionUp<Character> stack = new StackMyExceptionUp<Character>(10);
		Random random = new Random();

		// max out the stack with characters between a-z
		try {
		while (stack.push((char) (random.nextInt(26) + 'a')))
			;
		} catch (MikeException me){
			System.out.println(me);
		}

		Character ch;
		try {
			while ((ch = stack.pop()) != null) {
				System.out.println(ch);
			}
		} catch (MikeException me) {
			System.out.println(me);
		}
		System.out.println("\nEnd of stack");
	}

	/**
	 * 
	 * Adds something from the stack
	 * @param toAdd
	 *            The item to add to the list
	 * @return true if the item was added. false if the stack is full.
	 * @throws MikeException 
	 */
	public boolean push(T toAdd) throws MikeException {
		if (topIndex + 1 < stack.length) {
			stack[++topIndex] = toAdd;
			return true;
		}
		throw new MikeException("My spoon is too big");
	}

	/**
	 * Removes something from the stack
	 * @return the top item in the stack or null if the stack is empty.
	 * @throws MikeException 
	 */
	public T pop() throws MikeException {
		if (topIndex > -1) {
			return stack[topIndex--];
		}
		throw new MikeException("The stack is empty");
	}

}
