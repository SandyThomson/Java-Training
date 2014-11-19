package com.training.chapter4;

public class FinalizeDemo {

	private static final int max = 1000000;

	public static void main(String[] args) {
		System.out.println("Let's be dustmen!");

		for (int count = 0; count < max; count++) {
			Finalizer.generate(count);
		}
		
		System.out.println("Look at that heap of trash!");

	}

}
