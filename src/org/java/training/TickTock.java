package org.java.training;

public class TickTock {
	boolean isTick = true;
	
	private synchronized void cycle(boolean running, String msg, boolean state) {
		if ( !running ) {
			isTick = state;
			notify();
			return;
		}

		System.out.printf(msg);
		isTick = state;
		
		try {
			Thread.sleep(500);
			notify();
			while(state == isTick) wait();
		} catch( InterruptedException e ) {
			System.out.println("Interrupted.");
		}
	}
	
	void tick(boolean running) {
		cycle(running, "Tick ", true);
	}
	
	void tock(boolean running) {
		cycle(running, "Tock%n", false);
	}
	
	@FunctionalInterface
	public static interface Ticker { void next(boolean state); };
	
	public static Thread doTask(Ticker ticker, int count) {
		Thread t = new Thread(() -> {
			for(int i = count; i > 0; ticker.next(true), --i);
			ticker.next(false);
		});
		t.start();
		return t;
	}
		
	public static void main(String[] args) throws InterruptedException {
		TickTock treeTrunks = new TickTock();
		
		Thread a = doTask(treeTrunks::tick, 5);
		Thread b = doTask(treeTrunks::tock, 5);

		a.join();
		b.join();
	}

}
