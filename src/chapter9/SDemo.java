package chapter9;


// Demonstrate the Stack class.  
class SDemo {
	public static void main(String args[]) {
		// construct 10-element empty stack
		Stack stk1 = new Stack(10);

		char ch;
		int i;

		// put some characters into stk1
		try {
			for (i = 0; i < 11; i++)
				stk1.push((char) ('A' + i));
		} catch (StackFullException e) {
			e.printStackTrace();
		}

		// show the stacks.
		try {
			System.out.print("Contents of stk1: ");
			for (i = 0; i < 11; i++) {
				ch = stk1.pop();
				System.out.print(ch);
			}
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}

	}
}
