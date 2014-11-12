import java.io.IOException;

public class charChange {
  public static void main(String args[]) throws IOException {
  	char inChar = 0;
  	while ( true ) {
  		System.out.println("Enter a char and press enter: ");
  		char ignore;
  		inChar = (char) System.in.read();
  		do {
  			ignore = (char) System.in.read();
  		} while(ignore != '\n');
  		System.out.print("Read: '" + inChar + "', ");
  		if( inChar >= 'A' && inChar <= 'Z' ) {
  			inChar += 32;
  		} 
  		else if( inChar >= 'a' && inChar <= 'z' ) {
  			inChar -= 32;
  		} 
	  	System.out.println("Out: '" + inChar + "'");
  	} 
  }
}
