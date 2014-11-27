package com.selftest;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringBubbleSort {

    // swap array elements.
    public static final <T> void swap(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        String[] values = { "Scotland", "Argentina", "Brazil", "Spain", "Portugal", "Germany" };

        System.out.printf("Original array is: %s\n", 
                          Arrays.stream(values).collect(Collectors.joining(",")));

        BiConsumer<Integer, Integer> sort = (a, b) -> {
            if (values[a].compareTo(values[b]) > 0)
                swap(values, a, b);
        };

        IntStream.range(0, values.length)
                .boxed()
                .sequential()
                .forEach( i -> { IntStream.iterate(values.length - 1, j -> j - 1)
                                          .limit(values.length - i).boxed()
                                          .forEach(j -> { sort.accept(i, j); });
                        });
        
        System.out.printf("Sorted array is: %s\n", 
                          Arrays.stream(values).collect(Collectors.joining(",")));
    }

}
