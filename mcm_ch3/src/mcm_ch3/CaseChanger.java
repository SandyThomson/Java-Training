package mcm_ch3;


public class CaseChanger {

	public static void main( String[] args ) {
		System.out.println( "***************************" );
		System.out.println( "Enter a character, press enter and see it's case changed" );
		System.out.println( "Press (.) to quit." );
		System.out.println( "***************************" );

		char inp = ' ';

			try {

				inp = (char) System.in.read();
				
				char converted;
				if ( inp >= 'a' && inp <= 'z' ) {
					converted = (char) (inp - 32);
				}
				else if ( inp >= 'A' && inp <= 'Z' ) {
					converted = (char) (inp + 32);
				}
				else {
					//just return the character
					converted = inp;
				}

				System.out.println( "Character " + inp + " with the case changed is: " + converted );

			}
			catch ( Exception e ) {
				System.out.println( "Error reading input" );
				e.printStackTrace();
			}
	}
}
