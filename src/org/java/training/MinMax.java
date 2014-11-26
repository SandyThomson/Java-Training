package org.java.training;

public class MinMax {
	public static void main(String[] args) {
		int[] ls = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
		int min = ls[0], max = ls[0];
		
		for ( int i: ls ) {
			min = i < min ? i : min;
			max = i > max ? i : max;
		}

		System.out.printf("Min [%8d] Max [%8d]", min, max);
	}
}
