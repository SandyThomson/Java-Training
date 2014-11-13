import java.io.IOException;

class CharacterThing {

  public int countSpaces() throws IOException {
    char thing = (char)System.in.read();
	if ( thing == '.' ) {
	  return 0;
	}
	else if ( thing == ' ' ) {
	  return countSpaces() + 1; 
	}
	else {
	  return countSpaces();
	}
  }

  public static void main( String[] args ) {
    try {
	  CharacterThing thing = new CharacterThing();
	  System.out.println( thing.countSpaces() );
	}
	catch ( IOException e ) {
	  System.out.println( "Bang" );
	}
  }
}
