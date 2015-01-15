package mcm_chapter_9.stack;


//Demonstrate the Stack class.
public class SDemo {

	public static void main( String args[] ) {
		//construct 10-element empty stack
		Stack stk1 = new Stack( 10 );
		char name[] = { 'T', 'o', 'm' };

		//construct stack from array
		Stack stk2 = new Stack( name );
		char ch;
		int i;

		//put some characters into stk1
		try {
			for ( i = 0 ; i < 20 ; i++ ) {
				stk1.push( (char) ('A' + i) );
			}
		}
		catch ( StackFullException e ) {
			System.out.println( e.getMessage() );
		}

		//construct stack from another stack
		Stack stk3 = new Stack( stk1 );

		//show the stacks.
		System.out.print( "Contents of stk1: " );
		try {
			for ( i = 0 ; i < 20 ; i++ ) {
				ch = stk1.pop();
				System.out.print( ch );
			}
		}
		catch ( StackEmptyException e ) {
			System.out.println( e.getMessage() );
		}

		System.out.println( "\n" );
		System.out.print( "Contents of stk2: " );

		try {
			for ( i = 0 ; i < 3 ; i++ ) {
				ch = stk2.pop();
				System.out.print( ch );
			}
		}
		catch ( StackEmptyException e ) {
			System.out.println( e.getMessage() );
		}

		System.out.println( "\n" );
		System.out.print( "Contents of stk3: " );

		try {
			for ( i = 0 ; i < 20 ; i++ ) {
				ch = stk3.pop();
				System.out.print( ch );
			}
		}
		catch ( StackEmptyException e ) {
			System.out.println( e.getMessage() );
		}
		}
}