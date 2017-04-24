package com.interview.strings;

public class StringPerformance {
	//Time Taken by String:169605 ms
	public static void concatWithString(){
		String s1="Java";
		for(int i=0;i<100000;i++)
			s1 = s1+" Programming Java";
	}
	
	//Time Taken by StringBuffer:8 ms
	public static void concatWithStringBuffer(){
		StringBuffer sb=new StringBuffer("Java");
		for(int i=0;i<100000;i++)
			sb.append(" Programming Java");
	}
	
	@Deprecated
	public void abstarctClassTest(){
		System.out.println("Non abstract Parent Class");
	}
	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time Taken by String:"+(System.currentTimeMillis()-startTime)+" ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time Taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+" ms");
	}
}
