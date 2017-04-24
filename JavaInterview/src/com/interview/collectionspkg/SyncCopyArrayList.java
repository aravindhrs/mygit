package com.interview.collectionspkg;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncCopyArrayList {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
		arrayList.add("its me");
		arrayList.add("its me only");
		arrayList.add("its me, alone always");
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
