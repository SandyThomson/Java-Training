package com.selftest.stack;

@SuppressWarnings("serial")
public class StackEmptyException extends Exception {
    @Override
    public String getMessage() {
        return "Stack is empty";
    }
}
