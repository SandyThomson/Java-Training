package com.datacash.training.chapter11;

public class TaskProducer implements Runnable {

	Queue taskQueue;
	
	public TaskProducer ( Queue taskQueue ) {
		this.taskQueue = taskQueue;
	}
	
	@Override
	public void run() {

		for ( int i = 1; i <=20; i++ ) {
			try {
				Thread.sleep( i * 100 );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			taskQueue.put(new Task("Task " + i ));
		}
	}


}
