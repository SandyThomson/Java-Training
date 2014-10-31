class MoonGravity {
	public static void main( String[] args ) {
		if ( args.length == 0 ) {
			System.out.println( "Please input you weight in kg on earth" );
		}
		else {
			int earthWeight = Integer.parseInt( args[0] );
			int moonWeight = ( earthWeight * 100 ) / 17;
			System.out.println( "I recon on the moon you would weigh " + moonWeight + "kg" );
		}
	}
}
