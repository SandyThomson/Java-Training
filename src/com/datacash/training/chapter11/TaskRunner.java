package com.datacash.training.chapter11;

public class TaskRunner implements Runnable {

	Queue taskQueue;
	
	public TaskRunner ( Queue taskQueue ) {
		this.taskQueue = taskQueue;
	}
	
	@Override
	public void run() {
		
		for ( Task task = taskQueue.get(); task != null; task = taskQueue.get() ) {		
			try {
				Thread.sleep( 500 );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			task.doTask( Thread.currentThread().getName() );
		} 
		
		
	}

}
