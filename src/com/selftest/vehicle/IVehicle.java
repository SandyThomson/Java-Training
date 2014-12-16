package com.selftest.vehicle;

public interface IVehicle {

    int getPassengers();
    int getFuelCapacity();
    int getMilesPerGallon();

    int getRange();
    double getFuelNeeded(int miles);
}
