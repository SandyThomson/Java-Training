class InchesToMeters {
	private double inchesToMeters;

	public InchesToMeters( double inchesToMeters ) {
		this.inchesToMeters = inchesToMeters;
	}

	public void displayInchesToMetersConversionTable( int feet ) {
		int inches = inchesFromFeet( feet );
		System.out.println( "Inches  >  Meters" );
		for( int i = 1; i <= inches; i++ ) {
			String line = inches + "  >  " + metersFromInches( inches );
			if( i % 12 == 0 ){
				line = line + "\n"; 
			}
			System.out.println( line );
		}
	}

	private int inchesFromFeet( int feet ) {
		return feet * 12;
	}

	private double metersFromInches( double inches ) {
		return inches * inchesToMeters;
	}

	public static void main( String[] args ) {
		InchesToMeters converter = new InchesToMeters( 39.37 );
		converter.displayInchesToMetersConversionTable( 12 );
	}

}
