package com.interview.problemsolving;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveArrayDuplicates {
	public static void removeDuplicates(int[] dupArr){
		System.out.println("Array with duplicates");
		Set<Integer> set = new LinkedHashSet<>();
		for(int i: dupArr){
			System.out.print(i+"\t");
			set.add(i);
		}
		System.out.println();
		Object[] noDupArr = set.toArray();
		System.out.println("Array without duplicates");
		for(Object i:noDupArr)
			System.out.print((int)i+"\t");
			
	}
	public static void main(String[] args) {
		removeDuplicates(new int[]{4,6,4,5,2,3,9,6,3,7,2});
	}
}
