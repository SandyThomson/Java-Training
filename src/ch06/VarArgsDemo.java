package ch06;

public class VarArgsDemo {

	static int sum(int ... v) {
		int total = 0;
		
		for ( int i : v ) {
			total += i;
		}

		return total;
	}

	public static void main( String[] args ) {
		int total = sum( 1, 2, 3, 4, 5 );

		System.out.println( "Total = " + total );
	}
}
