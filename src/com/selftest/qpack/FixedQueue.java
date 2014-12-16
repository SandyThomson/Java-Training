package com.selftest.qpack;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class FixedQueue<T> extends AbstractQueue<T> {

    @SafeVarargs
    public FixedQueue(int size, T... values) {
        super(size, values);
    }

    public FixedQueue(int size, T start, BiFunction<T, Integer, T> functor) {
        super(size);
        IntStream.range(0, size).mapToObj(i -> functor.apply(start, i)).forEach(this::put);
    }

    @Override
    public Queue<T> put(T value) {
        if (putLoc == queue.length)
            throw new BufferOverflowException();
        queue[putLoc++] = value;
        return this;
    }

    @Override
    public T get() {
        if (getLoc == putLoc)
            throw new BufferUnderflowException();
        return super.get();
    }
}
