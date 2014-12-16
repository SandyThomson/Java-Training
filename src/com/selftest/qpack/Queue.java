package com.selftest.qpack;

import java.util.stream.Stream;

public interface Queue<T> extends Iterable<T> {

    Queue<T> put(T value);
    T get();

    default void reset() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    Stream<T> stream();
}
