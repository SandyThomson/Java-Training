package com.selftest;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.selftest.qpack.CircularQueue;
import com.selftest.qpack.DynamicQueue;
import com.selftest.qpack.FixedQueue;
import com.selftest.qpack.Queue;

public class QueueDemo {

    private static Function<Character, String> CHARACTER_TOSTRING = c -> {
        return c == null ? "_" : Character.toString(c); // using '_' to display null characters.
    };

    private static BiFunction<Character, Integer, Character> INCREMENT_CHARACTER = (c, i) -> {
        return (char) (c + i);
    };

    private static BiFunction<Character, Integer, Character> DECREMENT_CHARACTER = (c, i) -> {
        return (char) (c - i);
    };

    private static <T> void copyQueueContents(Queue<T> src, Queue<T> dest) {
        src.stream().forEach(dest::put);
    }

    public static void main(String[] args) throws NoSuchMethodException {

        Queue<Character> fixed = new FixedQueue<Character>(10);
        IntStream.range(0, 10).mapToObj(i -> INCREMENT_CHARACTER.apply('A', i)).forEach(fixed::put);
        System.out.printf("Fixed Queue: %s%n",
                          IntStream.range(0, 10)
                                   .mapToObj(i -> fixed.get())
                                   .map(CHARACTER_TOSTRING).collect(Collectors.joining()));

        Queue<Character> dynamic = new DynamicQueue<Character>(5);
        IntStream.range(0, 10).mapToObj(i -> DECREMENT_CHARACTER.apply('Z', i)).forEach(dynamic::put);
        System.out.printf("Dynamic Queue: %s%n",
                          IntStream.range(0, 10)
                                   .mapToObj(i -> dynamic.get())
                                   .map(CHARACTER_TOSTRING).collect(Collectors.joining()));

        Queue<Character> circular = new CircularQueue<Character>(10);
        IntStream.range(0, 10).mapToObj(i -> INCREMENT_CHARACTER.apply('A', i)).forEach(circular::put);
        System.out.printf("Circular Queue (1st pass): %s%n",
                          IntStream.range(0, 10)
                                   .mapToObj(i -> circular.get())
                                   .map(CHARACTER_TOSTRING).collect(Collectors.joining()));

        IntStream.range(10, 20).mapToObj(i -> INCREMENT_CHARACTER.apply('A', i)).forEach(circular::put);
        System.out.printf("Circular Queue (2nd pass): %s%n",
                          IntStream.range(0, 10)
                                   .mapToObj(i -> circular.get())
                                   .map(CHARACTER_TOSTRING).collect(Collectors.joining()));

        System.out.printf("Store/Consume from circular queue: %s%n",
                          IntStream.range(0, 26)
                                   .mapToObj(i -> circular.put(INCREMENT_CHARACTER.apply('A', i)).get())
                                   .map(CHARACTER_TOSTRING).collect(Collectors.joining()));

        dynamic.reset();
        System.out.printf("Dynamic Queue (after reset):%s%n",
                          dynamic.stream()
                                 .map(CHARACTER_TOSTRING).collect(Collectors.joining()));

        Queue<Character> alphabet = new FixedQueue<Character>(26, 'a', INCREMENT_CHARACTER);
        copyQueueContents(alphabet, dynamic);
        System.out.printf("Dynamic Queue (after copy):%s%n", 
                          dynamic.stream()
                                 .map(CHARACTER_TOSTRING).collect(Collectors.joining()));
    }
}
