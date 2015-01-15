package mcm_chapter_9.stack;


//A stack class for characters.
public class Stack {
	
	private char stck[]; // this array holds the stack
	
	private int tos; // top of stack
	
	//Construct an empty Stack given its size.
	public Stack(int size) {
		stck = new char[size]; // allocate memory for stack
		tos = 0;
	}
	
	//Construct a Stack from a Stack.
	public Stack( Stack ob ) {
		tos = ob.tos;
		stck = new char[ob.stck.length];
	
		//copy elements
		for(int i=0; i < tos; i++){
			stck[i] = ob.stck[i];
		}
	}
	
	//Construct a stack with initial values.
	public Stack(char a[]) {
		stck = new char[a.length];
		for(int i = 0; i < a.length; i++) {
			try {
				push( a[i] );
			}
			catch ( StackFullException e ) {
				System.out.println( e.getMessage() );
			}
		}
	}
	
	//Push characters onto the stack.
	public void push( char ch ) throws StackFullException {
		if(tos==stck.length) {
			throw new StackFullException();
		}
		
		stck[tos] = ch;
		tos++;
	}
	
	//Pop a character from the stack.
	public char pop() throws StackEmptyException {
		if(tos==0) {
			throw new StackEmptyException();
	}

		tos--;
	return stck[tos];
	}
}
