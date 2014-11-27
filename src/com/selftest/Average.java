package com.selftest;

import java.util.Arrays;

public class Average {

    public static void main(String[] args) {

        double[] values = { 1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9 };

        System.out.printf("Average value: %.2f%n", Arrays.stream(values).average().getAsDouble());

        // However, the answer they 'probably' want to see is something like:
        double sum = 0.0;
        for (double value : values)
            sum += value;

        System.out.printf("Average value: %.2f%n", (sum / values.length));
    }

}
