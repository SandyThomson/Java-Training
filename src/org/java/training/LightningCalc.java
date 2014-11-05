package org.java.training;

public class LightningCalc {
	
	public static final double FEET_PER_SECOND = 1_100;
	
	public static void main(String[] args) {
		double seconds = 7.2;
		double feet = seconds * FEET_PER_SECOND;

		System.out.println(String.format("The lightning is %.2f feet away", feet));
	}

}
