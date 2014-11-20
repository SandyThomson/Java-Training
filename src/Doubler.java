class Doubler {
  public static void main( String... args ) throws java.io.IOException {
    StringBuilder sb = new StringBuilder();
    int factor = 2;
    for ( int i = 1; i <= 100; i *= factor ) {
      sb.append( i );
      sb.append( ", ");
    } 
    System.out.println( sb.toString().substring( 0, sb.length() - 2) );
  }
}
