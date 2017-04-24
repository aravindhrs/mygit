package com.interview.exceptions;

public class OutOfMemoryErrorExample {
	public static void main(String[] args) {
		getMaxMemory();
	}
	
	public static void getMaxMemory(){
		System.out.println("Integer.MAX_VALUE:::"+Integer.MAX_VALUE);
		Long maxMemory = Runtime.getRuntime().maxMemory();
		System.out.println(maxMemory);
		//java.lang.OutOfMemoryError: Java heap space
		int[] incMaxMemory = new int[(int) (maxMemory + 1)];
		for(int i = 0; i < incMaxMemory.length; ++i)
			incMaxMemory[i] = i+1;
	}
	
	public static void getMaxMemory2(){
		//java.lang.OutOfMemoryError: Requested array size exceeds VM limit(heap size<matrix)
		int[] matrix = new int[Integer.MAX_VALUE];
		for(int i = 0; i < matrix.length; i++)
			matrix[i] = i+1;
	}
}
