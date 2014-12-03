package com.selftest;

public class Swap {

    private static class Test {
        int a;
        Test(int i) { a = i; }
    };
    
    private static final <T extends Test> void swap( T x, T y ) {
        int tmp = x.a;
        x.a = y.a;
        y.a = tmp;
    }
    
    public static void main( String[] args) {
        Test x = new Test(1);
        Test y = new Test(2);
        System.out.printf( "Before: first = %d and second = %d.%n", x.a, y.a );
        
        swap( x, y );
        System.out.printf( "Before: first = %d and second = %d.%n", x.a, y.a );
    }
}
