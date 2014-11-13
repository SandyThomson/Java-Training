class PowersOfTwo {
	
	public static void main( String[] args ) {
		for( int i = 1; i < 1000000; i += i ) {
			 System.out.println( i );
		}
	}
}
