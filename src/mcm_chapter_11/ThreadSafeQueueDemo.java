package mcm_chapter_11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import mcm_chapter_11.queue.DynQueue;
import mcm_chapter_11.queue.ICharQ;


//Demonstrate the ICharQ interface.
public class ThreadSafeQueueDemo implements Runnable {
	
	private ICharQ queue;
	private String name;
	
	public ThreadSafeQueueDemo(ICharQ queue){
		this.queue = queue;
	}
	
	public void addToQueue(){
		int i;
		
		queue.put((char) ('|'));
		for(i=0; i < 10; i++){
			queue.put((char) ('A' + i));
		}
		queue.put((char) ('|'));
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void run() {
		addToQueue();
		
		System.out.println("Running Thread: "+getName());
	
	}
	
	
	public static void main (String args[]){
		
		//setup  a queue to populate
		DynQueue dynamicQueue = new DynQueue();
		
		//Create a cached thread pool - more efficient for small jobs
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		
		//Create a bunch of threads and add them to the thread pool to be executed.
		for (int i=0; i<2000; i++){
			ThreadSafeQueueDemo demoThread = new ThreadSafeQueueDemo(dynamicQueue);
			demoThread.setName("Thread "+i);
			
			cachedThreadPool.execute(demoThread);
		}
		
		//Wait for threadpool to finish
		cachedThreadPool.shutdown();
		try {
			cachedThreadPool.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Now print out the queue;
		System.out.println("Queue:");
		int c;
		while((c = dynamicQueue.get()) != 0){
			System.out.print((char)c);
		}
		
		
		
		
	}
}
	
