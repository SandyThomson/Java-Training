package com.selftest;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Encode {

    private static final String KEY = "abcdefgh";

    private static final BiFunction<Integer, String, Integer> cipherCharAt = (a, b) -> {
        return (b.charAt(a) ^ KEY.charAt(a % KEY.length()));
    };

    private static String cipher(String message) {
        StringBuilder result = new StringBuilder();
        IntStream.range(0, message.length())
                 .boxed()
                 .map(i -> (char) cipherCharAt.apply(i, message).intValue())
                 .forEach(c -> result.append(c));

        return result.toString();
    }

    public static void main(String[] args) {
        String message = "This is a test message to encode and decode.";
        String encoded = cipher(message);
        String decoded = cipher(encoded);

        System.out.printf("Original message: %s%n", message);
        System.out.printf("Encoded message : %s%n", encoded);
        System.out.printf("Decoded message : %s%n", decoded);
    }

}
