package com.datacash.training.chapter11;

public class TickTock {
	String state; // contains the state of the clock

	synchronized void tick(boolean running) {
		if (!running) { // stop the clock
			state = "ticked";
			notify(); // notify any waiting threads
			return;
		}

		System.out.print("Tick ");
		state = "ticked"; // set the current state to ticked

		// sleep for half a second
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		notify(); // let tock() run
		try {
			while (!state.equals("tocked"))
				wait(); // wait for tock() to complete
		} catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}

	synchronized void tock(boolean running) {
		if (!running) { // stop the clock
			state = "tocked";
			notify(); // notify any waiting threads
			return;
		}

		System.out.println("Tock");
		state = "tocked"; // set the current state to tocked

		// sleep for half a second
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		notify(); // let tick() run
		try {
			while (!state.equals("ticked"))
				wait(); // wait for tick to complete
		} catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}

}