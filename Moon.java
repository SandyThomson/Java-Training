class Moon {

  private static final double MOON_GRAVITY_RATIO = 0.17;

  public static void main( String... args ) {

    String message;

    if ( args.length == 0 ) {
      message = "Provide your weight in kilograms as an argument";
    }
    else{
      double mass = Double.parseDouble( args[0] );
      message = "Your weight on the moon would be: " + mass * MOON_GRAVITY_RATIO + " newtons." ;
    }
    System.out.println( message );
  }
}
