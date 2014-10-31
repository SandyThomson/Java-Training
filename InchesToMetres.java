class InchesToMetres {

  static public void main( String... invocationParameters ){
    double inches, metres;
    int counter;
    final int TWELVE_FEET_IN_INCHES = 12 * 12;

    counter = 0;
    for(inches = 1; inches <= TWELVE_FEET_IN_INCHES; inches++) {
      metres = inches / 39.37; // convert to metres
      System.out.println(inches + " inches is " + metres + " metres.");
      counter++;
      // every 10th line, print a blank line
      if(counter == 10) {
        System.out.println();
        counter = 0; // reset the line counter
      }
    }
  }
}
