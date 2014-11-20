class SpaceCounter {
  public static void main( String... args ) throws java.io.IOException {

    int spaceCount = 0;
    char input = 0;

    System.out.println( "Type characters followed by enter. Type '.' to stop" );

    while ( input != '.') {
     input = ( char ) System.in.read();
     if ( input == ' ' ) spaceCount++;
    }

    System.out.println( "Number of spaces: " + spaceCount );

  }

}
