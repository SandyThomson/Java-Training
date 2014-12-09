package com.trythis;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TruckDemo {

    public static abstract class Vehicle {
        private int passengers;   // Number of passengers.
        private int fuelCapacity; // Fuel capacity (gallons)
        private int mpg;          // Fuel consumption (miles-per-gallon)

        public Vehicle(int passengers, int fuelCapacity, int mpg) {
            this.passengers = passengers;
            this.fuelCapacity = fuelCapacity;
            this.mpg = mpg;
        }

        public int getPassengers() {
            return passengers;
        }

        public int getRange() {
            return mpg * fuelCapacity;
        }

        public double getFuelRequired(int miles) {
            return (double) miles / mpg;
        }
    }

    public static class Truck extends Vehicle {
        private int cargoCapacity; // Cargo capacity (pounds)

        public Truck(int passengers, int fuelCapacity, int mpg, int cargoCapacity) {
            super(passengers, fuelCapacity, mpg);
            this.cargoCapacity = cargoCapacity;
        }

        public int getCargoCapacity() {
            return cargoCapacity;
        }
    }

    public static BiFunction<Map.Entry<String, Truck>, Integer, String> details = ( t, d ) -> {
        return new StringBuilder()
                .append(String.format("%s can carry %d passengers and %d pounds of cargo.%n",
                                      t.getKey(), t.getValue().getPassengers(), t.getValue().getCargoCapacity()))
                .append(String.format("To go %d miles %s needs %.2f gallons of fuel.%n",
                                      d, t.getKey(), t.getValue().getFuelRequired(d))).toString();
    };

    public static void main(String[] args) {
        Map<String, Truck> vehicles = new HashMap<String, Truck>();
        vehicles.put("semi", new Truck(2, 200, 7, 44000));
        vehicles.put("pickup", new Truck(3, 28, 15, 2000));

        int distance = 252;
        vehicles.entrySet().stream()
                           .map(v -> details.apply(v, distance))
                           .forEach(System.out::println);
    }
}
