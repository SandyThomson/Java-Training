/*
 * Sort an array of strings
 */

public class Sort {
  
  public static void main ( String[] args ) {
    
    // Set some strings
    String[] strings = { "Ardbeg", "Cragganmore", "Glenmorangie", "Laphroaig", "Glenfarclas",
                         "Jura", "Talisker", "Lavagulin", "Bowmore", "Glenlivet" };
    
    String t;
    int a, b;
    int size = strings.length;

    // Display original array
    System.out.print( "Original array is:");
    for ( String string : strings) System.out.print ( " " + string );
    System.out.println();
    
    // Bubbler
    for ( a = 1; a < size ; a++ ) {
      for ( b = size - 1 ; b >= a ; b -- )  {
        
        if ( strings[b - 1].compareTo(strings[b])> 0 ){
          // switch strings
          t = strings[b - 1];
          strings[b - 1] = strings[b];
          strings[b] = t;
          
        }
      }
    }
    
    // Display new array
    System.out.print( "New array is:");
    for ( String string : strings) System.out.print ( " " + string );
    System.out.println();
  
  }
}
