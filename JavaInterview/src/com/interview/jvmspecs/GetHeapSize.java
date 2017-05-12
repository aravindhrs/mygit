package com.interview.jvmspecs;

public class GetHeapSize {
	public static void main(String[] args) {
		System.out.println("JVM Heap Size: "+Runtime.getRuntime().totalMemory());
	}
}
