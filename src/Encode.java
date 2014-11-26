/*
 * Expanding the Encode class to use an eight character string
 */

public class Encode {
	
	public static void main (String[] args ) {
		
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";

		String key = "password";
		
		// Try using each char from the key for encoding
		int position = 0;
		char[] keyArray = key.toCharArray(); 
		
		System.out.println( "Original message: " + msg );
		
		// encode
		for (char c : msg.toCharArray() )	{
			encmsg += (char) (c ^ keyArray[ position++ % key.length() ] );
		}
		System.out.println( "Encoded message: " + encmsg );
		
		// reset position
		position = 0;
	
		// decode
		for (char c : encmsg.toCharArray() )	{
			decmsg += (char) (c ^ keyArray[ position++ % key.length() ] );
		}
		System.out.println( "Decoded message: " + decmsg );
	
	}

}
