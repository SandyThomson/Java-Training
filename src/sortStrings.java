

/*
 * Sort an array of strings
 */

public class sortStrings {
  
  public static void main ( String[] args ) {
    String[] data = { "yz", "def", "mno", "pqr", "abc", "stu", "vwx", "ghi", "jkl" };
    
    int a, b, size = data.length;

    // Display original array
    System.out.print( "Original array is:");
    for ( String string : data) System.out.print ( " " + string );
    System.out.println();
    
    // This is the Bubble Sort
    for ( a = 1; a < size ; a++ ) {
      for ( b = size - 1 ; b >= a ; b -- )  {
      	if(data[b-1].compareTo( data[b] ) > 0 ){
      		String t  = data[b-1];
      		data[b-1] = data[b];
      		data[b]   = t;
      	}
      }
    }
    
    // Display new array
    System.out.print( "New array is:");
    for ( String string : data) System.out.print ( " " + string );
    System.out.println();
  }
}
