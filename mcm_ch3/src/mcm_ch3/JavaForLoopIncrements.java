package mcm_ch3;


public class JavaForLoopIncrements {

	public static void main( String[] args ) {
		for ( int i = 1 ; i <= 2048 ; i = i * 2 ) {
			System.out.println( "Counter: " + i );
		}
	}
}
