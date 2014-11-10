package ch03;

class countSpaces {   
  public static void main(String args[])   
	    throws java.io.IOException {
       
    char ch;
    int count = 0;

    do {
      ch = (char) System.in.read(); // read a char from the keyboard

			if ( ' ' == ch ) count++;

    } while (ch != '.');

    System.out.println("\n" + count + " space(s) entered."); 
  }   
}
