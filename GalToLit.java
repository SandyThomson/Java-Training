/*
  Converts Gallons to Liters [sic]
*/
class GalToLit {

  // 1 Gallon = 3.7854 liters
  private static final double GALLONS_TO_LITERS_RATIO = 3.7854;

  public static void main( String... args ) {
    double gallons; // holds the number of gallons
    double liters;  // holds conversion to liters

    gallons = 10;

    liters = gallons * GALLONS_TO_LITERS_RATIO;

    System.out.println( gallons + " gallons is " + liters + " liters." );
  }
}
