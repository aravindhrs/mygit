package com.interview.collectionspkg;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(10, 28, "Aravindh"));
		arrayList.add(new Student(13, 25, "Jeyashri"));
		arrayList.add(new Student(12, 29, "Vidhubala"));
		arrayList.add(new Student(18, 27, "Suji"));
		arrayList.add(new Student(14, 26, "Rubika"));
		
		ArrayList<Student> arrayList1 = new ArrayList<>();
		arrayList1.add(new Student(10, 28, "Aravindh"));
		arrayList1.add(new Student(13, 25, "Jeyashri"));
		arrayList1.add(new Student(12, 29, "Vidhubala"));
		arrayList1.add(new Student(18, 27, "Suji"));
		arrayList1.add(new Student(14, 26, "Rubika"));
		
		System.out.println(Collections.disjoint(arrayList, arrayList1));
		
		Collections.sort(arrayList, new AgeComparator().reversed());
		for(Student st:arrayList){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		} 
		System.out.println("----------");
		Collections.sort(arrayList, new NammeComparator());
		for(Student st:arrayList){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		} 
	}
}
