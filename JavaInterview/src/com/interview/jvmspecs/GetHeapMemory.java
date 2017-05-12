package com.interview.jvmspecs;

public class GetHeapMemory {
	public static void main(String[] args) {
		int mb = 1024*1024;
		Runtime runtime = Runtime.getRuntime();
		System.out.println("##### Heap utilization statistics [MB] #####");
		System.out.println("Used Memory:"+ (runtime.totalMemory() - runtime.freeMemory()) / mb +" MB");
		System.out.println("Free Memory:"+ runtime.freeMemory() / mb +" MB");
		System.out.println("Total Memory:" + runtime.totalMemory() / mb +" MB");
		System.out.println("Max Memory:" + runtime.maxMemory() / mb +" MB");
	}
}
