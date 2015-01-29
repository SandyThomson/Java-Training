package com.datacash.training.chapter11;

public class Question12 {

	public static void main(String[] args) {

		Queue taskQueue = new Queue(20);
		
		Thread producerOne = new Thread( new TaskProducer( taskQueue ), "Producer thread" );
		Thread consumerOne = new Thread( new TaskRunner( taskQueue ), "Consumer thread 1" );
		Thread consumerTwo = new Thread( new TaskRunner( taskQueue ), "Consumer thread 2" );
		
		producerOne.start();
		consumerOne.start();
		consumerTwo.start();
		
	}

}
