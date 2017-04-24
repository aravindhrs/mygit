package com.interview.collectionspkg;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesArrayList {
	public static void main(String[] args) {
		List<Integer> dupPrimeList = new ArrayList<>();
		dupPrimeList.add(3);
		dupPrimeList.add(5);
		dupPrimeList.add(7);
		dupPrimeList.add(7);
		dupPrimeList.add(11);
		System.out.println("dupPrimeList:"+dupPrimeList);
		
		Set<Integer> dupPrimeSet = new LinkedHashSet<>(dupPrimeList);
		dupPrimeList.clear();
		dupPrimeList.addAll(dupPrimeSet);
		System.out.println("dupPrimeSet:"+dupPrimeSet);
	}
}
