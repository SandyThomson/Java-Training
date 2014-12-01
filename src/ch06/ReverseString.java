package ch06;

public class ReverseString {

	static String reverse(String str) {
		if(str.length() == 0) {
			return "";
		}

		return str.charAt( str.length() - 1 ) + reverse( str.substring( 0, str.length() - 1 ) );
	}

	public static void main( String[] args ) {
		String reversed = reverse( "?siht daer uoy nac" );

		System.out.println( "reverse = " + reversed );
	}

}
