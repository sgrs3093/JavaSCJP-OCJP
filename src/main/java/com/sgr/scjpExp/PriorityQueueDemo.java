package com.sgr.scjpExp;

import java.util.*;

public class PriorityQueueDemo {
	public static void main(String args[]) {
		// Creating an empty PriorityQueue
		PriorityQueue<String> queue = new PriorityQueue<String>();

		// Use add() method to add elements into the Queue
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");

		// Displaying the PriorityQueue
		System.out.println("Initial PriorityQueue: " + queue);

		// Fetching and removing the element at the head of the queue
		System.out.println("The element at the head of the" + " queue is: " + queue.poll());
		
		System.out.println("The element at the head of the" + " queue is: " + queue.peek());

		// Displaying the Queue after the Operation
		System.out.println("Final PriorityQueue: " + queue);
	}
}