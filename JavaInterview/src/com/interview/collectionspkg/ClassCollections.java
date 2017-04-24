package com.interview.collectionspkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ClassCollections {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		//al.add("a");
		//System.out.println(al.size());
		Iterator<String> itr=al.iterator();
		TreeSet<String> ts = new TreeSet<>(al);
		ts.add("b");
		//Iterator<String> tsitr=ts.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
			//itr.remove();
			//System.out.println(al.size());
		}
		//while(tsitr.hasNext())
			//System.out.println(tsitr.next());
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		//Map<String,Integer> map = new HashMap<>();
		long t1=System.currentTimeMillis();
		System.out.println("L1 start:"+t1);		
		for (int i=0; i < list.size(); i++){
			list.get(i);
			//list.add(h);
		}
		long t2=System.currentTimeMillis();
		System.out.println("L1 end:"+(t2-t1));
		
		System.out.println("L2 start:"+t2);
	    for (Iterator<Integer> i=list.iterator(); i.hasNext(); )
	      i.next();
	    System.out.println("L2 end:"+(System.currentTimeMillis()-t2));
	    System.out.println(Object.class.getClass().toString());
	}
	
}
