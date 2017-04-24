package com.interview.threads;

import java.io.IOException;

public class GarbageCollectionTest implements Cloneable{

	public void finalize(){
		System.out.println("Garbage collected for unreferenced objects and freed up heap memory!!!");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		GarbageCollectionTest gt1 = new GarbageCollectionTest();
		GarbageCollectionTest gt2 = new GarbageCollectionTest();
		GarbageCollectionTest gt3 = new GarbageCollectionTest();
		gt1=null;
		gt3=gt1=gt2;
		gt2=gt1=gt3;
		System.gc();
		Runtime r = Runtime.getRuntime();
		System.out.println("r: "+r.totalMemory());
		Runtime r1 = Runtime.getRuntime();
		System.out.println("r1: "+r1.freeMemory());
		
		//Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		Runtime.getRuntime().exec("C:\\Windows\\System32\\shutdown.exe -s -t 0"); 
	}
}
