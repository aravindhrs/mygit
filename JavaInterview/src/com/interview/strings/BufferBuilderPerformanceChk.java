package com.interview.strings;

public class BufferBuilderPerformanceChk {
	
	//Time Taken by StringBuffer:1617 ms
		public static void concatWithStringBuffer(){
			StringBuffer sb=new StringBuffer("Java");
			for(int i=0;i<20000000;i++)
				sb.append(" Programming Java");
		}

	//Time Taken by StringBuilder:934 ms
	public static void concatWithStringBuilder(){
		StringBuilder builder=new StringBuilder("Java");
		for(int i=0;i<20000000;i++)
			builder.append(" Programming Java");
	}
	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time Taken by StringBuilder:"+(System.currentTimeMillis()-startTime)+" ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time Taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+" ms");
	}

}
