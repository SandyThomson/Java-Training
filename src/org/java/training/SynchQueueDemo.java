package org.java.training;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SynchQueueDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		try ( final Stream<String> tickTock = Files.lines(Paths.get("src/org/java/training/TickTock.java"));
		      final Stream<String> syncDemo = Files.lines(Paths.get("src/org/java/training/SynchQueueDemo.java")) ) {
			if( !demo(8, tickTock, syncDemo) ) {
				System.err.println("Failed to process all files in time.");
			}
		}
	}
	
	public static boolean demo(int consumerCount, Stream<String>... load) throws InterruptedException, IOException {
		Queue<String> messages = new LinkedQueue<>();
		List<Runnable> ops = new ArrayList<>();

		CountDownLatch writeLatch = new CountDownLatch(load.length);

		// Build a number of consumers:
		for(int i = 0; i < consumerCount; ++i) {
			ops.add(() -> {
				String next;
				while(writeLatch.getCount() > 0 || messages.hasNext()) {
					while((next = messages.tryNext()) != null)
						System.out.printf("Thread [%s] got: %s%n", Thread.currentThread().getName(), next);
				}
			});
		}
		
		// And a producer for each stream of input:
		for ( Stream<String> input : load ) {
			 ops.add(() -> {
				input.forEach(messages::put);
				writeLatch.countDown();
			});
		}
		
		ExecutorService exec = Executors.newFixedThreadPool(ops.size());
		ops.stream().forEach(exec::execute);
		exec.shutdown();
		return exec.awaitTermination(5, TimeUnit.SECONDS);
	}
}

interface Queue<T> extends Iterable<T> {
	Queue<T> put(T item);
	T get();
	boolean hasNext();
	T tryNext();
	
	default Stream<T> stream() {
		return StreamSupport.stream(spliterator(), false);
	}
	
	default <E extends T, Source extends Iterable<E>> Queue<T> copy( Source that ) {
		that.forEach(this::put);
		return this;
	}
}

class LinkedQueue<T> implements Queue<T> {
	private class Node {
		T item;
		Node next;
	}
	private Node head;
	
	public LinkedQueue() {
		head = new Node();
		head.next = head;
	}
	
	public <E extends T, Source extends Iterable<E>> LinkedQueue( Source that ) {
		this();
		copy(that);
	}

	public synchronized LinkedQueue<T> put(T item) {
		Node init = head.next;
		head.next = new Node();
		head = head.next;
		head.item = item;
		head.next = init;
		return this;
	}
	
	public synchronized T tryNext() {
		if ( hasNext() ) return get();
		return null;
	}
	
	public synchronized boolean hasNext() {
		return head.next != head;
	}

	public synchronized T get() {
		T item = head.next.next.item;
		if ( head.next == head ) throw new BufferUnderflowException();
		head.next = head.next.next;
		return item;
	}
	
	public synchronized Iterator<T> iterator() {
		return new Iterator<T>() {
			Node index = head.next.next;

			public boolean hasNext() {
				synchronized(LinkedQueue.this) {
					return index != head.next;
				}
			}
			public T next() {
				synchronized(LinkedQueue.this) {
					T item = index.item;
					index = index.next;
					return item;
				}
			}
		};
	}
}