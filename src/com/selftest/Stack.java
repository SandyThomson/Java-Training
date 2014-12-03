package com.selftest;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Stack implements Iterable<Character> {
    private char[] stack;
    private int capacity;
    private int size;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new char[this.capacity];
        this.size = 0;
    }

    public Stack(Stack other) {
        this.capacity = other.capacity;
        this.stack = new char[this.capacity];
        IntStream.range(0, other.size).forEach(i -> this.push(other.stack[i]));
    }

    public Stack(char[] values) {
        this.capacity = values.length;
        this.stack = new char[this.capacity];
        for (char c : values)
            this.push(c);
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Character next() {
                return pop();
            }
        };
    }

    public Stream<Character> stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    public Stack push(char value) throws IndexOutOfBoundsException {
        if (size + 1 > capacity)
            throw new IndexOutOfBoundsException("Error: The stack is full.");

        this.stack[size++] = value;
        return this;
    }

    public char pop() throws NoSuchElementException {
        if (isEmpty())
            throw new NoSuchElementException("Error: The stack is empty.");

        return this.stack[--size];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public static void main(String[] args) {
        try {
            Stack stack = new Stack(8);
            "hgfedcba".chars().mapToObj(i -> (char) i).forEach(stack::push);

            Stack newStack = new Stack(stack);
            Stack anotherStack = new Stack(new char[] { 'z', 'y', 'x', 'w' });

            System.out.printf("Queue: %s%n", stack.stream().map(c -> c.toString()).collect(Collectors.joining(",")));
            System.out.printf("Copy : %s%n", newStack.stream().map(c -> c.toString()).collect(Collectors.joining(",")));
            System.out.printf("Array: %s%n", anotherStack.stream().map(c -> c.toString()).collect(Collectors.joining(",")));

            // try to read an empty stack.
            stack.pop();

        } catch (IndexOutOfBoundsException | NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}