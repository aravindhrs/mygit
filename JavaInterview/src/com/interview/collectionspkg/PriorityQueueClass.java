package com.interview.collectionspkg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
	public static void main(String[] args) {
		PriorityQueue<String>  priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Aravindh");
		priorityQueue.add("Jeyashri");
		priorityQueue.add("Vidhubala");
		priorityQueue.add("UshaRani");
		priorityQueue.add("Suji");
		priorityQueue.add("Vidhubala");
		priorityQueue.add("Jeyashri");
		priorityQueue.add("Priya");
		priorityQueue.add("Rubika");
		Iterator<String> iterator=priorityQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}
}
