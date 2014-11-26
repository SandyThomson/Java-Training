package com.selftest;

public class DoubleAverage {

	public static double computeAverage(double... list) {

		int count = 0;
		double sum = 0;

		for (double val : list) {
			sum += val;
			count++;
		}

		if (count > 0) {
			return sum / count;
		} else {
			return 0;
		}

	}

}
