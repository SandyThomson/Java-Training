package com.training.chapterthree;

public class PowersOfTwo {

	public static void main(String[] args) {

		try {
			int max = Integer.parseInt(args[0]);

			for (int i = 1, j = 0; j <= max; i *= 2, j++) {
				System.out.println( "2 to the power 0f " + j + " = " + i );

				if (i < 0) {
					System.out.println("Nice job breaking the boundaries of integers");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Invalid arg!");
		}

	}

}
