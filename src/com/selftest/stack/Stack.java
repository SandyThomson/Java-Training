package com.selftest.stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Stack<T> implements Iterable<T> {
    private T[] stack;
    private int size;

    @SafeVarargs
    public Stack(int size, T... values) {
        stack = Arrays.copyOf(values, size);
        size = 0;
    }

    public Stack<T> push(T value) throws StackFullException {
        if (size == stack.length)
            throw new StackFullException();

        stack[size++] = value;
        return this;
    }

    public T pop() throws StackEmptyException {
        if (size == 0)
            throw new StackEmptyException();

        return stack[--size];
    }

    public Stream<T> stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int position = size;

            @Override
            public boolean hasNext() {
                return position > 0;
            }

            @Override
            public T next() {
                return stack[--position];
            }
        };
    }
}
