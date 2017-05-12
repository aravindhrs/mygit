package com.interview.collectionspkg;

import java.util.LinkedList;

public class CopyLinkedListToArray {
	public static void main(String a[]){
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual LinkedList:"+arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("Created Array content:");
		for(String str:strArr){
			System.out.println(str);
		}
	}
}
