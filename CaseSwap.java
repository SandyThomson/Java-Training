class CaseSwap {
	
	public static void main( String[] args ) throws java.io.IOException {
		
		int ignore, input, output;
		int swapCount = 0;
		
		do {
			System.out.println( "Enter a character and press return. '.' to end:" );
			input = System.in.read();
			
			do {
				ignore = System.in.read();
			} while ( ignore != '\n' );
			
			if( 65 <= input && input <= 90 ) {
				output = input + 32; 
				swapCount++;
			}
			else if( 97 <= input && input <= 122 ) {
				output = input - 32;
				swapCount++;
			}
			else {
				output = input;
			}
			
			System.out.println( "[" + (char) input + "] -> [" + (char) output + "]" );
			
		} while( input != '.' );
		
		System.out.println( "There were " + swapCount + " case conversions.  Goodbye!" );
	}
}
