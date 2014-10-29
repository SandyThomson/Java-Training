package org.java.training;

public class GallonsToLitersTable {

	public static void main(String[] args) {

		double gallons = 1.0;
		for(int i = 1; gallons <= 100.0; ++gallons, i = ++i % 10) {
			double liters = gallons * 3.7854;

			System.out.println(String.format("%3.0f gallons is %.4f liters", gallons, liters));

			if(i == 0)
				System.out.println();
		}
	}
}
