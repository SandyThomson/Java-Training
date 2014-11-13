import java.io.IOException;

class CharacterCase {

  public int doStuff() throws IOException {
    int thing = System.in.read();
	if ( thing == 46 ) {
	  return 0;
	}
	else if ( thing > 64 && thing < 91 ) {
      System.out.println( (char)thing + " became " + (char)( thing + 32 ) );
	  return doStuff() + 1;
	}
    else if ( thing > 96 && thing < 123 ) {
      System.out.println( (char)thing + " became " + (char)( thing - 32 ) );
      return doStuff() + 1;
	}
	else {
	  return doStuff();
	}
  }

  public static void main( String[] args ) {
    CharacterCase thing = new CharacterCase();
    try {
	  System.out.println( thing.doStuff() );
	}
	catch ( IOException e ) {
	  System.out.println( "Bang" );
	}
  }
}
