class AsciiCaseChanger {

  static final char HALT_CHAR = '.';

  public static void main( String... args ) throws java.io.IOException {

    char input = 0;

    System.out.println( "Enter a letter ('" + HALT_CHAR + "' to stop)");

    do {
      input = ( char ) System.in.read();
      if ( input >= 'a' && input <= 'z' ) { 
        input -= 32;
        System.out.println( input );
      }
      else if ( input >= 'A' && input <= 'Z' ) {
        input += 32;
        System.out.println( input );
      }
    } while ( input != HALT_CHAR );

  }
}
