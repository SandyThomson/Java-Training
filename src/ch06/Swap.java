package ch06;

class Test {

	int a;

	Test( int i ) {
		a = i;
	}

	void swap( Test that ) {
		int tmp = this.a;
		this.a = that.a;
		that.a = tmp;
	}
}

public class Swap {

	public static void main( String[] args ) {
		Test testObject1 = new Test( 1 );
		Test testObject2 = new Test( 2 );

		testObject1.swap( testObject2 );

		System.out.println( "testObject1's a = " + testObject1.a );
		System.out.println( "testObject2's a = " + testObject2.a );
	}

}
