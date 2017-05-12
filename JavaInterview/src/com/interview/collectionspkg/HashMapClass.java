package com.interview.collectionspkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapClass {
	public static void main(String[] args) {
		HashMapClass class1  = new HashMapClass();
		class1.hashCode();
		class1.equals(class1);
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(null, "0");
		hashMap.put(1, "1");
		hashMap.put(2, "2");
		hashMap.put(3, null);
		hashMap.put(4, null);
		//hashMap.put(5, "6");
		hashMap.put(1, "5");
		for(Map.Entry<Integer, String> mapEntry:hashMap.entrySet())
			System.out.println(mapEntry.getKey()+" :"+mapEntry.getValue());
		System.out.println("Username equals:"+Objects.equals("aravindh", System.getProperty("user.name")));
	}

	/*@Override
	public int hashCode() {
		HashMapClass class1  = new HashMapClass();
		System.out.println("Hashcode:"+class1.hashCode());
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals:"+super.equals(obj));
		return super.equals(obj);
	}*/

	@Override
	public String toString() {
		return super.toString();
	}
	
}
