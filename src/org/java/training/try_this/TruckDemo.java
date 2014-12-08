package org.java.training.try_this;

import java.util.function.BiFunction;

/**
 * Try This 7-1. Not a whole lot we can add to this.
 */
public class TruckDemo {
	public static void main(String[] args) {
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		
		BiFunction<Truck, String, String> truckInfo = truckInfoForDistance(252);  
		
		System.out.println( truckInfo.apply(semi, "Semi") );
		System.out.println( truckInfo.apply(pickup, "Pickup") );
	}
	
	private static BiFunction<Truck, String, String> truckInfoForDistance(int distance) {
		return (truck, label) -> String.format(
			"%s can carry %d pounds.%nTo go %d miles %s needs %.2f gallons of fuel.%n",
			label, truck.getCargoCapacity(), distance, label.toLowerCase(), truck.fuelForJourney(distance));
	}
}

class Vehicle {
	private int passengers, fuelCapacity, milesPerGallon;
	
	Vehicle(int passengers, int fuelCapacity, int milesPerGallon) {
		setPassengers(passengers).setFuelCapacity(fuelCapacity)
			.setMilesPerGallon(milesPerGallon);
	}
	
	int range() {
		return milesPerGallon * fuelCapacity;
	}
	
	double fuelForJourney(int miles) {
		return (double)miles / milesPerGallon;
	}
	
	int getPassengers() { return passengers; }
	int getFuelCapacity() { return fuelCapacity; }
	int getMilesPerGallon() { return milesPerGallon; }
	
	Vehicle setPassengers(int passengers) {
		this.passengers = passengers;
		return this;
	}
	Vehicle setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
		return this;
	}
	Vehicle setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
		return this;
	}
}

class Truck extends Vehicle {
	private int cargoCapacity;
	
	Truck(int passengers, int fuelCapacity, int milesPerGallon, int cargoCapacity) {
		super(passengers, fuelCapacity, milesPerGallon);
		setCargoCapacity(cargoCapacity);
	}
	
	int getCargoCapacity() { return cargoCapacity; }
	Truck setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
		return this;
	}
}