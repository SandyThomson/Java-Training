package com.trythis;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bubble {

    public static final void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    public static void main(String[] args) {
        int numbers[] = { 99, -10, 100123, 18, -978, 5623, 4653, -9, 287, 49 };

        System.out.printf( "Original array is: %s\n", Arrays.stream( numbers ).boxed().map( String::valueOf ).collect( Collectors.joining( "," ) ) );
        
        // Using the 'sorted' functionality on a stream.
        System.out.printf( "Sorted array is: %s\n", Arrays.stream( numbers )
                                                          .boxed()
                                                          .sorted( Integer::compare ).map( String::valueOf ).collect( Collectors.joining( "," ) ) );

        // Using the actual 'Bubble Sort' algorithm required.
        BiConsumer<Integer, Integer> swapArrayElements = (a, b) -> {
            if ( numbers[a] > numbers[b] ) {
                swap( numbers, a, b );
            }
        };
        
        IntStream.range(0, numbers.length)
                 .boxed()
                 .sequential()
                 .forEach( i -> { IntStream.iterate(numbers.length - 1, j -> j - 1)
                                           .limit( numbers.length - i )
                                           .boxed() 
                                           .forEach( j -> { 
                                               swapArrayElements.accept(i, j); 
                                           });
                                });
        System.out.printf( "Sorted array is: %s\n", Arrays.stream( numbers ).boxed().map( String::valueOf ).collect( Collectors.joining( "," ) ) );
    }

}
