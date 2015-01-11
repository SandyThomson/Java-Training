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

	public void push(char c) throws StackFullException {
		if (currentSize > maxArrayIndex) {
			throw new StackFullException("Stack is full, mkay");
		}

		rawStack[maxArrayIndex - currentSize] = c;
		currentSize++;
	}

	public char pop() throws StackEmptyException {
		if (currentSize <= 0) {
			throw new StackEmptyException("Stack is empty, mkay");
		}
		currentSize--;
		char c = rawStack[maxArrayIndex - currentSize];
		return c;
	}

}
