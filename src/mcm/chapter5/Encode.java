package mcm.chapter5;


public class Encode {

	public String encode( String phrase, String key ) {

		StringBuilder encrypted = new StringBuilder();
		phrase.chars().forEach( next -> {
			encrypted.append( (char) (next ^ key.length()) );
		} );

		return encrypted.toString();

	}


	public static void main( String[] args ) {
		Encode encoder = new Encode();
		
		String valToEncode = "Java is just so great";
		String key = "javabaws";
		String encodedVal = encoder.encode( valToEncode, key );
		String decodedVal = encoder.encode( encodedVal, key );
		
		System.out.println( "*********** Encoder Output ************" );
		System.out.println( "Value to encode: " + valToEncode );
		System.out.println( "Encoded Value: " + encodedVal );
		System.out.println( "Decoded Value: " + decodedVal );

	}

}
