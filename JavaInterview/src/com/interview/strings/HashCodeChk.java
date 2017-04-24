package com.interview.strings;

public class HashCodeChk {
	public static void main(String[] args) {
		//Returns different hash code
		String str1="Java";
		System.out.println(str1.hashCode());
		str1=str1+str1;
		System.out.println(str1.hashCode());
		System.out.println(str1);
		
		System.out.println("--------");
		//Returns same hash code
		StringBuffer buffer=new StringBuffer("Java");
		System.out.println(buffer.hashCode());
		buffer.append(buffer);
		System.out.println(buffer.hashCode());
		System.out.println(buffer.toString());
	}
}
