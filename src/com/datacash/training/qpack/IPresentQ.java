package com.datacash.training.qpack;

//A child queue interface. It's Santa's list of presents!
public interface IPresentQ {

	// Put a child into the queue.    
	void put( Child child );

	// Get a child from the queue.   
	Child get();

}
