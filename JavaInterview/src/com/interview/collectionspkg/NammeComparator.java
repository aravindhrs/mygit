package com.interview.collectionspkg;

import java.util.Comparator;

public class NammeComparator implements Comparator<Student>{
	public int compare(Student st1,Student st2){
		return st1.name.compareTo(st2.name);
	}
}
