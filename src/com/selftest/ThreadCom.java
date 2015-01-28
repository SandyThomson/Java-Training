package com.selftest;

class ThreadCom {
	public static void main(String args[]) {
		TickTock tt = new TickTock();
		MyThread mt1 = new MyThread("Tick", tt);
		MyThread mt2 = new MyThread("Tock", tt);

		try {
			mt1.getThread().join();
			mt2.getThread().join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
	}
}
