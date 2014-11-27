package com.trythis;

import java.util.Arrays;

public class ShowBits {
    
    public static String show (long value, int numberOfBits ) {        
        StringBuilder output = new StringBuilder();
        
        int spacer = 1;
        for (long mask = 1L << (numberOfBits - 1); mask != 0; mask >>>= 1, spacer++) {
            output.append( (value  & mask) != 0 ? 1 : 0   ).append(
                           (spacer % 8)    != 0 ? "" : " ");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        
        int[][] values = { {123      , 8 }, // 123 in 8-bits.
                           {87987    , 32}, // 87987 in 32-bits.
                           {237658768, 64}, // 237658768L in 64 bits.
                           {87987    , 8 }  // 87987 in 8-bits (low order 8 bits only)
                         };
        
        Arrays.stream( values )
              .map( v -> { return String.format("%d in binary (%d-bits):%n%s%n", v[0], v[1], ShowBits.show( v[0], v[1] ) ); } )
              .forEach( System.out::println );
    }
}
