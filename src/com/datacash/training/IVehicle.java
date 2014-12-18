
package com.datacash.training;

public interface IVehicle {

	// Let's have a default implementation because why not
	public default int range() {
		return getMpg() * getFuelCap();
	}

	public double fuelNeeded( int miles );

	// Why do we have accessor methods for instance variables that don't exist? 
	// Might as well use an abstract class
	public int getPassengers();

	public void setPassengers( int passengers );

	public int getFuelCap();

	public void setFuelCap( int fuelCap );

	public int getMpg();

	public void setMpg( int mpg );

}
