package chapter4;


public class FDemo {

	int x;

	public FDemo( int x ) {
		this.x = x;
	}

	protected void finalize() {
		System.out.println( "Finalizing: " + this.x );
	}

	public void generator(int i){
		FDemo o = new FDemo( i );
	}
}
