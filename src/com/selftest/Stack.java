package com.selftest;

public class Stack {

	private char[] rawStack;
	private int maxArrayIndex;
	private int currentSize;

	public Stack(int initialSize) {
		maxArrayIndex = initialSize - 1;
		currentSize = 0;
		rawStack = new char[initialSize];
	}

	public void push(char c) {
		if (currentSize > maxArrayIndex) {
			throw new RuntimeException("Stack is full, mkay");
		}

		rawStack[maxArrayIndex - currentSize] = c;
		currentSize++;
	}

	public char pop() {
		if (currentSize < 0) {
			throw new RuntimeException("Stack is empty, mkay");
		}
		currentSize--;
		char c = rawStack[maxArrayIndex - currentSize];
		return c;
	}

}
