package com.interview.collectionspkg;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Arrays;

@SuppressWarnings("rawtypes")
public class ListRemoveTest {
	private static final int NUM = 50000;
	private static Object[] objs = null;

	
	public void removeLast(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = NUM; i > 0; i--) {
			list.remove(i - 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken for removing Objects at End: " + (endTime - startTime));
	}

	public void removeFirst(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			list.remove(0);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken for removing Objects at First : " + (endTime - startTime));
	}

	public void removeMiddle(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < NUM; i++) {
			list.remove((NUM - i) / 2);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken for removing Objects at Middle : " + (endTime - startTime));
	}

	@SuppressWarnings({ "unchecked" })
	public void doTest(List collection) {
		collection.addAll(getList()); // fill the List
		removeLast(collection);
		clear(collection);
		collection.addAll(getList()); // fill the List
		removeMiddle(collection);
		clear(collection);
		collection.addAll(getList()); // fill the List
		removeFirst(collection);
		clear(collection);
	}

	public void clear(List col) {
		if (!col.isEmpty())
			col.clear();
	}

	public List getList() {
		objs = new Object[NUM];
		for (int i = 0; i < NUM; i++) {
			objs[i] = new Object();
		}
		return Arrays.asList(objs);
	}

	public static void main(String[] args) {
		ListRemoveTest col = new ListRemoveTest();
		ArrayList collection1 = new ArrayList();
		col.doTest(collection1);
		Vector collection2 = new Vector();
		col.doTest(collection2);
		LinkedList collection4 = new LinkedList();
		col.doTest(collection4);
	}
}