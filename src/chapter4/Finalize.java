package chapter4;


public class Finalize {

	public static void main( String args[] ) {
		int count;

		FDemo fd = new FDemo( 0 );

		for ( count = 1 ; count < 100000 ; count++ ) {
			fd.generator( count );
		}
	}
}
