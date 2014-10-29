package org.java.training;

public class GallonsToLiters {

	public static double LITRES_PER_GALLON = 3.7854;

	public static void main(String[] args) {
		double gallons = 10;
		System.out.println(String.format("%.0f gallons is %.2f liters", gallons, gallons * LITRES_PER_GALLON));
	}
}
