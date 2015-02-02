
package com.selftest.stack;

import java.util.Iterator;
import java.util.stream.Stream;

public interface Stack<T> extends Iterable<T> {

	Stack<T> push( T value ) throws StackFullException;

	T pop() throws StackEmptyException;

	Iterator<T> iterator();

	Stream<T> stream();
}
