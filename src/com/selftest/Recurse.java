package com.selftest;

public class Recurse {
    
    private static void reverse( String message, int position ) {
        System.out.print( message.toCharArray()[position] );
        if (position > 0 ) 
            reverse( message, --position );
    }
    
    public static void main( String[] args ) {
        String message = "reverseme";
        System.out.printf( "%s -> ", message );
        
        reverse(message, message.length() - 1);
    }   
}
