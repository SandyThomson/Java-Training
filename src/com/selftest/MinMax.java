package com.selftest;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {
        int numbers[] = { 99, -10, 100123, 18, -978, 5623, 4653, -9, 287, 49 };

        int min, max;
        min = max = numbers[0];

        for (int number : numbers) {
            min = number < min ? number : min;
            max = number > max ? number : max;
        }
        System.out.printf("Min = %d and Max = %d.%n", min, max);

        // could also use the min() and max() stream functionality.
        System.out.printf("Min = %d and Max = %d.%n", 
                          Arrays.stream(numbers).min().getAsInt(), Arrays.stream(numbers).max().getAsInt());
    }

}
