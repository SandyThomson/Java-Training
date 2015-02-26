package mcm_chapter_14;


// Use a method reference to an instance method.
// A functional interface for numeric predicates that operate
// on integer values.
interface IntPredicate {

	boolean test( int n );
}

//This class stores an int value and defines the instance
//method isFactor(), which returns true if its argument
//is a factor of the stored value.
class MyIntNum {

	private int v;

	MyIntNum( int x ) {
		v = x;
	}

	int getNum() {
		return v;
	}

	//Return true if n is a factor of v.
	boolean isFactor( int n ) {
		return (v % n) == 0;
	}

	boolean hasCommonFactor( int n ) {
		for ( int i = 2 ; i < v / i ; i++ )
			if ( ((v % i) == 0) && ((n % i) == 0) ) return true;
		return false;
	}

}

public class MethodRefDemo2 {

	public static void main( String args[] )
	{
		boolean result;
		MyIntNum myNum = new MyIntNum( 12 );
		MyIntNum myNum2 = new MyIntNum( 16 );
		// Here, a method reference to isFactor on myNum is created.
		IntPredicate ip = myNum::isFactor;
		// Now, it is used to call isFactor() via test().
		result = ip.test( 3 );
		if ( result ) System.out.println( "3 is a factor of " + myNum.getNum() );
		// This time, a method reference to isFactor on myNum2 is created.
		// and used to call isFactor() via test().
		ip = myNum2::isFactor;
		result = ip.test( 3 );
		if ( !result ) System.out.println( "3 is not a factor of " + myNum2.getNum() );

		int comp1 = 20;
		MyIntNum myNum3 = new MyIntNum( comp1 );
		IntPredicate ip2 = myNum3::hasCommonFactor;
		
		int comp2 = 7;
		
		if ( ip2.test( comp2 ) )
			System.out.println( comp2 + " has a common factor with " + comp1 );
		else
			System.out.println( comp2 + " does not have a common factor with " + comp1 );
		
	}
}