package ch03;

class InvertCase {   

	public static void main( String args[] )
	    throws java.io.IOException {

    char ch;
    int count = 0;

    do {
      ch = (char) System.in.read(); // read a char from the keyboard

      // Wonder when we'll learn about methods and libraries?
      // A nice isLower and isUpper would be better here.
      if( 'a' <= ch && ch <= 'z' ) {
        ch -= 32;
        count++;
      }
			else if ( 'A' <= ch && ch <= 'Z' ) {
        ch += 32;
        count++;
      }

      System.out.print(ch);

    } while (ch != '.');

    System.out.println("\n\nChanged case of " + count + " character(s)."); 
	}
}
