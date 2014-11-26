package org.java.training;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Try this 5-2 using a circular buffer.
 */
public class QDemo {
	public static void main(String[] args) {
		CharQueue queue = new CharQueue(26);
		for(char c = 'A'; c <= 'Z'; queue.put(c++));
		
		queue.stream().forEach(System.out::print);
	}
}

class CharQueue implements Iterable<Character>{
	char[] data;
	int head, tail, len;
	
	CharQueue(int size) {
		head = tail = 0;
		data = new char[size];
	}
	
	CharQueue put(char ch) {
		if(size() >= capacity())
			throw new BufferOverflowException();
		data[head++] = ch;
		head %= data.length;
		len++;
		return this;
	}
	
	char get() {
		if(size() == 0)
			throw new BufferUnderflowException();
		char c = data[tail];
		tail = ++tail % data.length;
		--len;
		return c;
	}
	
	int capacity() {
		return data.length;
	}

	int size() {
		return len;
	}

	@Override
	public Iterator<Character> iterator() {
		return new Iterator<Character>() {
			int index = tail, sz = size();
			@Override
			public boolean hasNext() {
				return sz > 0;
			}
			@Override
			public Character next() {
				--sz;
				return data[index++ % data.length];
			}
		};
	}
	
	public Stream<Character> stream() {
		return StreamSupport.stream(this.spliterator(), false);
	}
}
