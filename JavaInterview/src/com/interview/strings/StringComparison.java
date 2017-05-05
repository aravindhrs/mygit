package com.interview.strings;

public class StringComparison {
	public static void main(String[] args) {
		String s1="abc";
		String s2 = new String(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
}
