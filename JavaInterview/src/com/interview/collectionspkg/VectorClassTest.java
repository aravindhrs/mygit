package com.interview.collectionspkg;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClassTest {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.addElement("Test");
		vector.add("Hello");
		vector.add(2, "Second");
		vector.add(3, "Fifth");
		vector.set(3, "Third");
		Iterator<String> iterator = vector.iterator();
		ListIterator<String> listIterator = vector.listIterator(2);
		for (String string : vector) {
			System.out.println(string);
		}
		System.out.println("");
		Enumeration<String> en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println((String) en.nextElement());
		}
		System.out.println("");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
		System.out.println("");
		while(iterator.hasNext())
			System.out.println(iterator.next().toString());
		
		int a = 10,b;
		b = a>0?callGrt(a):callLst();
		System.out.println(b);
		System.out.println((a&b));
	}
	
	public static int callGrt(int a){
		return a;
	}
	
	public static int callLst(){
		return 0;
	}
}
