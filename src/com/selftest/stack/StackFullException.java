
package com.selftest.stack;

@SuppressWarnings( "serial" )
public class StackFullException extends Exception {

	@Override
	public String getMessage() {
		return "Stack is full";
	}
}
