package com.selftest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sum {

    public static int sum(int... values) {
        return Arrays.stream(values).sum();
    }

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.printf( "%s = %d%n",
                           Arrays.stream(values).mapToObj(String::valueOf).collect(Collectors.joining(" + ")), 
                           sum(values));
    }
}
