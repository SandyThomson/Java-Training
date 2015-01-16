package selftest;

class StackFullException extends Exception {
	private int size;

	StackFullException(int s) {
		size = s;
	}

	public String toString() {
		return "\nStack is full (max size " + size + ")";
	}
}

class StackEmptyException extends Exception {
	public String toString() {
		return "\nStack is empty";
	}
}

class Stack {
	// these members are now private
	private char s[]; // this array holds the queue
	private int cursor;

	Stack(int size) {
		s = new char[size]; // allocate memory for queue
		cursor = 0;
	}

	Stack(char[] chars) {
		s = new char[chars.length];

		for (char c : chars) {
			try {
				push(c);
			} catch (StackFullException e) {
				System.out.println(e);
			}
		}
		cursor = s.length;
	}

	// Put a character into the stack.
	void push(char c) throws StackFullException {
		if (cursor == s.length) {
			throw new StackFullException(s.length);
		}
		s[cursor] = c;
		cursor++;
	}

	// Get a character from the stack.
	char pop() throws StackEmptyException {
		if (cursor == 0) {
			throw new StackEmptyException();
		}
		cursor--;
		return s[cursor];
	}
}

class StackDemo {
	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		Stack s = new Stack(ch);

		try {
			System.out.println("Popping 5th char off stack: " + s.pop());
		} catch (StackEmptyException e) {
			System.out.println(e);
		}

		System.out.println("Pushing 5th char to stack");
		try {
			s.push('e');
		} catch (StackFullException e) {
			System.out.println(e);
		}
		System.out.println("Pushing 6th char to stack");
		try {
			s.push('f');
		} catch (StackFullException e) {
			System.out.println(e);
		}

		System.out.print("Popping all chars off stack: ");

		for (int i = 0; i < 6; i++) {
			try {
				System.out.print(s.pop());
			} catch (StackEmptyException e) {
				System.out.println(e);
			}
		}
		System.out.println();
	}
}
