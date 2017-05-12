package com.interview.collectionspkg;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		TreeSet<String>  treeSet = new TreeSet<>();
		treeSet.add("Aravindh");
		treeSet.add("Jeyashri");
		treeSet.add("Vidhubala");
		treeSet.add("UshaRani");
		treeSet.add("Suji");
		treeSet.add("Vidhubala");
		treeSet.add("Jeyashri");
		treeSet.add(null);
		Iterator<String> iterator=treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}
}
