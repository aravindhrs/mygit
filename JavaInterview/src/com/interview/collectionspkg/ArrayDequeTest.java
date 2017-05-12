package com.interview.collectionspkg;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>(0);
		deque.add(" Hello");
		deque.addLast(" Programming");
		deque.add(" Java");
		deque.addFirst("Welcome!");
		for(String str: deque)
			System.out.print(str);
		
		System.out.println();
		
		Deque<Integer> deque1 = new ArrayDeque<Integer>(2);
		   deque1.add(15);
		   deque1.add(30);
		   deque1.add(20);
		   deque1.add(18);
		   deque1.offerFirst(25);
		   
		   System.out.println(1_0_0);
	}
}
