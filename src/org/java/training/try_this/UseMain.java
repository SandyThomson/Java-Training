package org.java.training.try_this;

import java.util.function.Consumer;

/**
 * Try This 11-2
 */
public class UseMain {
	public static final Consumer<Thread> PRINT_THREAD = t ->
		System.out.printf("Main thread: [%s]%n   Priority: [%d]%n%n", t.getName(), t.getPriority());

	public static void main(String[] args) {
		Thread self = Thread.currentThread();
		PRINT_THREAD.accept(self);
		
		self.setName("Main Fred");
		self.setPriority(Thread.NORM_PRIORITY + 3);
		
		PRINT_THREAD.accept(self);
	}
}

