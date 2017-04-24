package com.interview.strings;

public class IndexOf {
	public static void main(String[] args) {
		String str="Hi this is java program";
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("p", 10));
		System.out.println(str.indexOf("java", 3));
	}
}
