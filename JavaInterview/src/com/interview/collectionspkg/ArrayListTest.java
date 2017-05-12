package com.interview.collectionspkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The class {@code ArrayList} are subclasses of
 * {@code AbstractList} that indicates derived and implemented
 *
 * <p>The class {@code Exception} and any subclasses that are not also
 * subclasses of {@link ArrayDequeTest} are <em>checked
 * exceptions</em>.  Checked exceptions need to be declared in a
 * method or constructor's {@code throws} clause if they can be thrown
 * by the execution of the method or constructor and propagate outside
 * the method or constructor boundary.
 *
 * @author  Aravindh RS
 * @see     LinkedListClass
 * @since   JDK8.0
 */
public class ArrayListTest {
	public static void main(String[] args) {
		
		//ArrayList<String> aList1=new ArrayList<>(25);
		List<String> aList1=new CopyOnWriteArrayList<>();
		//System.out.println("Capacity:"+aList1.size());
		aList1.add("Firsta");
		aList1.add("Firstb");
		aList1.add("Firstc");
		aList1.add("Firstd");
		aList1.add("Firste");
		//((ArrayList<String>) aList1).trimToSize();
		ArrayList<String> aList2=new ArrayList<>(25);
		aList2.add("Firsta");
		aList2.add("Firstb1");
		aList2.add("Firstc1");
		aList2.add("Firstd1");
		aList2.add("Firste1");
		//System.out.printf("%12i", 123);
		System.out.println("Before altering:"+aList1.size()+" : "+aList1);
		ArrayList<Integer> aList3=new ArrayList<>();
		aList3.add(2147483647);
		aList3.add(2147483646);
		
		Iterator<String> itr1 = aList1.iterator();
		while (itr1.hasNext()) {
				String string = (String) itr1.next();
				if(string.equals("Firstc")){
					aList1.remove(string);
					aList1.add("Firstc");
				}
				System.out.println(string);
		}
		System.out.println("-------");
		System.out.println("After altering:"+aList1.size()+" : "+aList1);
		System.out.println(aList1.get(2));
		System.out.println(Collections.disjoint(aList1, aList2));
		
		if(!Collections.disjoint(aList1, aList2))
			System.out.println("Match found!!!");
		else
			System.out.println("No Matches!!!");

		if(aList1.equals(aList2))
			System.out.println("equals");
		else
			System.out.println("not equals");
		
		System.out.println("List1:"+aList1.hashCode()+" ,List2:"+aList2.hashCode());
		
		
	}
}
