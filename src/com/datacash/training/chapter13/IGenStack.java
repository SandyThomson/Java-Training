
package com.datacash.training.chapter13;

public interface IGenStack<T> {

	public T pop() throws ArrayEmptyException;

	public void push( T obj ) throws ArrayFullException;

}
