package com.interview.collectionspkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncArrayList {
	public static void main(String[] args) {
		List<String> alList = Collections.synchronizedList(new ArrayList<>());
		alList.add("Pen");
		alList.add("Paper");
		alList.add("Eraser");
		
		synchronized (alList) {
			Iterator<String> itr = alList.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
		}
	}
}
