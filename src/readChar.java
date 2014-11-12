import java.io.IOException;

public class readChar {
  public static void main(String args[]) throws IOException {
  	int spaceCounter = 0;
  	char inChar = 0;
  	do {
  		System.out.println("Enter a char and press enter: ");
  		if( inChar == ' ' ) {
  			spaceCounter++;
  		}
  		char ignore;
  		inChar = (char) System.in.read();
  		do {
  			ignore = (char) System.in.read();
  		} while(ignore != '\n');
  		System.out.println("Read: '" + inChar + "'");
  	} while( inChar != '.' );
  	System.out.println("Number of spaces: " + spaceCounter);
  }
}
