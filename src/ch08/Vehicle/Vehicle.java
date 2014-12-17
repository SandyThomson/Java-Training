package ch08.Vehicle;

// Try This 7-1
//
// Build a subclass of Vehicle for trucks. 
class Vehicle implements IVehicle {

  private int passengers; // number of passengers    
  private int fuelcap;    // fuel capacity in gallons   
  private int mpg;        // fuel consumption in miles per gallon   
   
  // This is a constructor for Vehicle.  
  Vehicle(int p, int f, int m) {  
    passengers = p;  
    fuelcap = f;  
    mpg = m;  
  }  
 
  // Return the range.   
	@Override
	public int range() {
    return mpg * fuelcap;   
  }   
   
	// Compute fuel needed for a given distance.
	@Override
	public double fuelneeded( int miles ) {
    return (double) miles / mpg;   
  } 
 
  // Access methods for instance variables. 
	@Override
	public int getPassengers() {
		return passengers;
	}

	@Override
	public void setPassengers( int p ) {
		passengers = p;
	}

	@Override
	public int getFuelcap() {
		return fuelcap;
	}

	@Override
	public void setFuelcap( int f ) {
		fuelcap = f;
	}

	@Override
	public int getMpg() {
		return mpg;
	}

	@Override
	public void setMpg( int m ) {
		mpg = m;
	}
   
}    
