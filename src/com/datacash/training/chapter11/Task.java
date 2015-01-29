package com.datacash.training.chapter11;

public class Task {

	private String name;
	
	public Task ( String name ) {
		this.name = name;
	}
	
	public void doTask( String threadName ) {
		System.out.println( threadName + " performing task: " + name );
	}
	
}
