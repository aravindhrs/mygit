package com.interview.collectionspkg;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	public static void main(String[] args) {
		Map<String,String> conMap = new ConcurrentHashMap<>();
		conMap.put("K1", "V1");
		conMap.put("K2", "V2");
		conMap.put("K3", "V3");
		Iterator<String> itr = conMap.keySet().iterator();
		Iterator<String> itr1 = conMap.keySet().iterator();
		while(itr.hasNext()){
			String key = itr.next();
			System.out.println("Key: "+key+" Value:"+conMap.get(key));
			if(key.equals("K3")){
				//conMap.remove(key);
				conMap.put("K4", "V4");
				conMap.put("K5", "V5");
			}
		}
		System.out.println("Map Size:"+conMap.size());
		System.out.println("------------------");
		while(itr1.hasNext()){
			String key = itr1.next();
			System.out.println("Key: "+key+" Value:"+conMap.get(key));
		}
		
		Iterator<String> it  = conMap.keySet().iterator();
		Iterator<String> it1  = conMap.values().iterator();
		System.out.println("Iteration:");
		while (it.hasNext()) {
			while(it1.hasNext()){
				String string = (String) it.next();
				System.out.println(string+" "+it1.next());
			}
		}
		
		Set<Entry<String, String>> entrySet = conMap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
