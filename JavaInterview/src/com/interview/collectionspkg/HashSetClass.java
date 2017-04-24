package com.interview.collectionspkg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String>  hashSet = new HashSet<>();
		hashSet.add("Aravindh");
		hashSet.add("Jeyashri");
		hashSet.add("Suji");
		hashSet.add("Aravindh");
		hashSet.add("jeyashri");
		hashSet.add(null);
		hashSet.add(null);
		Iterator<String> iterator=hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}
}
