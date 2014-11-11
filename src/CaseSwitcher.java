/*
 * Read some characters
 * Switch upper to lower, lower to upper
 * count how many times this happens
 * end on a full stop
 */

public class CaseSwitcher {
	
	public static void main ( String[] args ) 
		throws java.io.IOException {
		
		System.out.println( "Enter some characters, '.' to end: ");
		char in;
		int switchCount = 0;
		
		for ( ; ; ) { // infinito loopo
			in = (char) System.in.read();
			
			if ( in == '.' ){
				break;
			}
			else if ( in >= 65 && in <= 90 ) {
				in += 32;
				switchCount++;
			}
			else if ( in >= 97 && in <=  122 ) {
				in -= 32;
				switchCount++;
			}
      System.out.println( in );
		}
		
		System.out.println( switchCount + " letters were switched.");
	}

}
