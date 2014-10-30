/*
  Try this 1-2
*/
class GalToLitTable {
  
  private static final double GALLONS_TO_LITERS_RATIO = 3.7854;

  public static void main( String... args ) {
    double gallons, liters;
    int counter = 0;

    for( gallons = 1; gallons <= 100; gallons++ ) {
      liters = gallons * GALLONS_TO_LITERS_RATIO;
      System.out.println( gallons + " gallons is " +
          liters + " liters" );
      counter++;
      if( counter == 10 ) {
        System.out.println();
        counter = 0;
      }
    }
  }
}
