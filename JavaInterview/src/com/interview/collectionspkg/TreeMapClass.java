package com.interview.collectionspkg;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap=new TreeMap<>();
		treeMap.put("Aravindh", 85);
		treeMap.put("Priya", 55);
		treeMap.put("Jeyashri", 54);
		treeMap.put("Rubika", 52);
		treeMap.put("Vidhubala", 52);
		treeMap.put("Vidhubala", 52);
		for(Map.Entry<String, Integer> entry:treeMap.entrySet())
			System.out.println(entry.getKey()+" Value:"+entry.getValue());
	}
}
