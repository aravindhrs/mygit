package com.interview.collectionspkg;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet<String>  linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Aravindh");
		linkedHashSet.add("UshaRani");
		linkedHashSet.add("Suji");
		linkedHashSet.add("Jeyashri");
		linkedHashSet.add("Vidhubala");
		linkedHashSet.add("Aravindh");
		linkedHashSet.add("Jeyashri");
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		Iterator<String> iterator=linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}
}
