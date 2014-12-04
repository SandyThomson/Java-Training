package com.selftest;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Stack implements Iterable<Character> {
    private char[] stack;
    private int size;

    public Stack(int capacity) {
        this.stack = new char[capacity];
        this.size = 0;
    }

    public Stack(Stack other) {
        this.stack = new char[other.stack.length];
        IntStream.range(0, other.stack.length).forEach( i -> this.push( other.stack[i] ) );
    }

    public Stack(char[] values) {
        this.stack = new char[values.length];
        for (char c : values)
            this.push(c);
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            int position = size;
            
            @Override
            public boolean hasNext() {
                return position > 0;
            }

            @Override
            public Character next() {
                return stack[--position];
            }
        };
    }

    public Stream<Character> stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    public Stack push(char value) throws BufferOverflowException {
        if (size + 1 > this.stack.length)
            throw new BufferOverflowException();

        this.stack[size++] = value;
        return this;
    }

    public char pop() throws BufferUnderflowException {
        if (isEmpty())
            throw new BufferUnderflowException();

        return this.stack[--size];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public static void main(String[] args) {
        try {
            Stack stack = new Stack(8);
            "abcdefgh".chars().mapToObj(i -> (char) i).forEach(stack::push);

            Stack newStack = new Stack(stack);
            Stack anotherStack = new Stack(new char[] { 'w', 'x', 'y', 'z' });
            
            System.out.printf("Queue: %s%n", stack.stream().map(c -> c.toString()).collect(Collectors.joining(",")));
            System.out.printf("Copy : %s%n", newStack.stream().map(c -> c.toString()).collect(Collectors.joining(",")));
            System.out.printf("Array: %s%n", anotherStack.stream().map(c -> c.toString()).collect(Collectors.joining(",")));

            // try to read an empty stack.
            while ( !stack.isEmpty() ) stack.pop();
            stack.pop();

        } catch (BufferOverflowException | BufferUnderflowException e) {
            System.out.println("Stack is " + (e instanceof BufferOverflowException ? "full." : "empty."));
        }
    }
}