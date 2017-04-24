package com.interview.collectionspkg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Aravindh");
		linkedList.add("Jeyashri");
		linkedList.add("Aravindh");
		linkedList.add("I Love Jeyashri");
		linkedList.add(null);
		linkedList.add("Jeyashri left me");

		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
