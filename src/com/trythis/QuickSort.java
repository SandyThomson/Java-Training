package com.trythis;

import java.util.Arrays;

public class QuickSort {

    private static final <T extends Comparable<T>> boolean LESS_THAN( T a, T b ) {
        return a.compareTo( b ) < 0;
    }
    
    private static final <T extends Comparable<T>> boolean GREATER_THAN( T a, T b ) {
        return a.compareTo( b ) > 0;
    }
    
    private static final <T> void swap(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    private static <T extends Comparable<T>> void sort( T[] items, int left, int right ) {
        int i = left;
        int j = right;
        
        T t = items[ (left + right)/2 ];
        do {
            while( LESS_THAN( items[i], t ) && i < right ) i++;
            while( GREATER_THAN( items[j], t ) && j > left ) j--;
            
            if ( i <= j )
                swap(items, i++, j);           
        } while ( i <= j );

        if ( left  < j ) sort( items, left, j  );
        if ( right > i ) sort( items, i, right );
    }
    
    public static <T extends Comparable<T>> void quickSort( T[] items ) {
        sort(items, 0, items.length - 1);
    }
    
    public static void main( String[] args ) {
        Character[] values = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        System.out.printf( "Original array: %s%n", Arrays.toString( values ) );
        
        QuickSort.quickSort( values );
        System.out.printf( "Sorted array: %s%n", Arrays.toString( values ) );
    }
}
