class ReadCharacters {
	
	public static void main( String[] args ) throws java.io.IOException {
		
		char ignore, input;
		int spaceCount = 0;
		
		do {
			System.out.println( "Enter a character and press return. '.' to end:" );
			input = (char) System.in.read();
			
			do {
				ignore = (char) System.in.read();
			} while ( ignore != '\n' );
			
			System.out.println( "You entered [" + input + "]" );
			
			if( input == ' ' ) {
				spaceCount++;
			}
		} while( input != '.' );
		
		System.out.println( "You entered " + spaceCount + " space(s).  Goodbye!" );
	}
}
