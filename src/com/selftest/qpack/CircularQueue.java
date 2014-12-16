package com.selftest.qpack;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class CircularQueue<T> extends AbstractQueue<T> {

    @SafeVarargs
    public CircularQueue(int size, T... values) {
        super(++size, values);
    }

    @Override
    public Queue<T> put(T value) {
        if (putLoc == getLoc - 1 || putLoc - getLoc == queue.length)
            throw new BufferOverflowException();
        putLoc %= queue.length;

        queue[putLoc++] = value;
        return this;
    }

    @Override
    public T get() {
        if (getLoc == putLoc)
            throw new BufferUnderflowException();
        getLoc %= queue.length;

        return super.get();
    }
}
