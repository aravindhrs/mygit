package com.interview.strings;

public class StringCompPerformance {
	public static void main(String[] args) {
		String str1="Hello";
		String str2=" Java";
		String str3=" Programming";
		String str4=" Welcome !!!";
		
		long t1=System.currentTimeMillis();		
		//String strCon1="Hello"+" Java"+" Programming"+" Welcome";			
		System.out.println("+ Const-->:"+(System.currentTimeMillis()-t1));
		
		long t2=System.currentTimeMillis();
		//String strCon2=str1+str2+str3+str4;//Poor performance				
		System.out.println("+ Const-->:"+(System.currentTimeMillis()-t2));
		
		long t3=System.currentTimeMillis();	
		StringBuilder builder = new StringBuilder();
		builder.append("Hello").append(" Java").append(" Programming").append(" Welcome");		
		System.out.println("+ Const-->:"+(System.currentTimeMillis()-t3));
		
		long t4=System.currentTimeMillis();
		StringBuilder builder1 = new StringBuilder();
		builder1.append(str1).append(str2).append(str3).append(str4);		
		System.out.println("+ Const-->:"+(System.currentTimeMillis()-t4));
	}
}
