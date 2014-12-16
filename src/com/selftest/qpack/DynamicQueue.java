package com.selftest.qpack;

import java.nio.BufferUnderflowException;
import java.util.Arrays;

public class DynamicQueue<T> extends AbstractQueue<T> {

    @SafeVarargs
    public DynamicQueue(int size, T... values) {
        super(size, values);
    }

    @Override
    public Queue<T> put(T value) {
        if (putLoc == queue.length) {
            queue = Arrays.copyOf(queue, queue.length * 2);
        }
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