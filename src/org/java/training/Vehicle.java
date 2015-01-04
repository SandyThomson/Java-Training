package org.java.training;

public interface Vehicle {
	int range();
	double fuelNeeded(int miles);

	// Getters and setters in an interface seem like poor design,
	// Java: A Beginner's Guide 6th edition.
	int getPassengers();
	Vehicle setPassengers(int passengers);

	int getFuelCapacity();
	Vehicle setFuelCapacity(int fuelCapacity);

	int getMilesPerGallon();
	Vehicle setMilesPerGallon(int mpg);
}