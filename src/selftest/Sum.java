package selftest;

class Sum {
	
	public static void main( String[] args ) {
		
		SumInts si = new SumInts();
		
		System.out.println( "First sum: " + si.sum( 1, 2, 3, 4, 5) );
		System.out.println( "Second sum: " + si.sum( 4, 5) );
	}
}

class SumInts {
	int sum( int ... ints ) {
		int sum = 0;
		
		for ( int i : ints ) {
			sum += i;
		}
		return sum;
	}

}
