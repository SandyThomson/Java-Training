package org.java.training.try_this;

/**
 * Try This 11-1
 */
public class ExtendThread extends Thread {
	
	ExtendThread(String name) {
		super(name);
		this.start();
	}

	@Override
	public void run() {
		System.out.printf("Starting thread: [%s]%n", getName());
		try {
			for(int i = 0; i < 10; Thread.sleep(400), System.out.printf("[%s]: count is [%d]%n", getName(), i++));
		} catch (InterruptedException e) {
			System.err.printf("[%s] interrupted", getName());
		}
		System.out.printf("[%s] terminating.", getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		new ExtendThread("Fred");
		for (int i = 0; i < 50; Thread.sleep(100), System.out.print('.'), ++i);
		System.out.printf("Main thread (%s) ending.%n", Thread.currentThread().getName());
	}
}
