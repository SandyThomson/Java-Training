package org.java.training;

import org.java.training.qpack.DynamicQueue;
import org.java.training.qpack.LinkedQueue;
import org.java.training.qpack.Queue;

/**
 * Try this 8-1 and question #1.
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<Character> queue = exampleDynamicQueue();
		exampleLinkedQueue(queue);
	}
	
	public static Queue<Character> exampleLinkedQueue( Queue<Character> queue ) {
		Queue<Character> linked = new LinkedQueue<>(queue);
		
		// Remove first 2 chars:
		linked.get();
		linked.get();
		
		System.out.println();
		linked.stream().forEach(System.out::print);
		return linked;
	}
	
	public static Queue<Character> exampleDynamicQueue() {
		Queue<Character> queue = new DynamicQueue<>();
		
		for(char c = 'A'; c <= 'Z'; queue.put(c++));
		queue.stream().forEach(System.out::print);
		
		// Now fill it past initial capacity
		for(char c = 'a'; c <= 'z'; queue.put(c++));
		
		System.out.println();
		queue.stream().forEach(System.out::print);
		return queue;
	}
}
