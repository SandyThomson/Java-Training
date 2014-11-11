/* 
 * Read characters until a period.
 * Count the number of spaces
 */

public class SpaceCounter {
	
	public static void main ( String[] args ) 
		throws java.io.IOException {
		
		System.out.println( "Enter some characters, '.' to end: ");
		char in;
		int spaceCount = 0;
		
		for ( ; ; ) { // infinity loopy
			in = (char) System.in.read();
			
			if ( in == '.' ){
				break;
			}
			else if ( in == ' ' ) {
				spaceCount++;
			}
		}
		
		System.out.println( "You typed " + spaceCount + " spaces.");
	}
}
