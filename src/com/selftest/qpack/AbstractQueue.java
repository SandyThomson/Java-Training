package com.selftest.qpack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected T[] queue;
    protected int putLoc, getLoc;

    @SafeVarargs
    public AbstractQueue(int size, T... values) {
        queue = Arrays.copyOf(values, size);
        putLoc = getLoc = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int position = 0;

            @Override
            public boolean hasNext() {
                return position < queue.length;
            }

            @Override
            public T next() {
                return queue[position++];
            }
        };
    }

    @Override
    public T get() {
        T value = queue[getLoc];
        queue[getLoc++] = null;
        
        return value;
    }
    
    @Override
    public void reset() {
        Arrays.fill(queue, null);
        putLoc = getLoc = 0;
    }

    @Override
    public Stream<T> stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }
}