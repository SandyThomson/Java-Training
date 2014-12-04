package selftest;

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
		
		for ( char c : chars ) {
			push(c);
		}
		cursor = s.length;
	}
	
	// Put a character into the stack.
	void push(char c) {
		if( cursor == s.length ) {
			System.out.println(" – Stack is full.");
			return;
		}
		s[cursor] = c;
		cursor++;
	}

	// Get a character from the stack.
	char pop() {
		if(cursor == 0) {
			System.out.println(" – Stack is empty.");
			return (char) 0;
		}
		cursor--;
		return s[cursor];
	}
}


class StackDemo {
	public static void main( String[] args ) {
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		Stack s = new Stack( ch );
		
		System.out.println("Popping 5th char off stack: " + s.pop() );
		
		System.out.println("Pushing 5th char to stack");
		s.push('e');
		System.out.println("Pushing 6th char to stack");
		s.push('f');
		
		System.out.print("Popping all chars off stack: ");
		
		for ( int i = 0; i < 6; i++ ) {
			System.out.print( s.pop() );
		}
		System.out.println();
	}
}