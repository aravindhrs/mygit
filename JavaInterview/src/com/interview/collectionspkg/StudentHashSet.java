package com.interview.collectionspkg;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSet {
	public static void main(String[] args) {
		Student st1 = new Student(1, 22, "SIVA");
		Student st2 = new Student(2, 23, "JEEVA");
		Student st3 = new Student(1, 22, "SIVA");
		
		Set<Student> set = new HashSet<>(0);
		set.add(st1);
		set.add(st2);
		set.add(st2);
		set.add(st3);
		set.add(null);
		System.out.println(set.size());
		System.out.println(set);
	}
}
