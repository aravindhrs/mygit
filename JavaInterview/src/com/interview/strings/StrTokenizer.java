package com.interview.strings;

import java.util.StringTokenizer;

public class StrTokenizer {
	public static void main(String[] args) {
		String str="Hello Java world";
		StringTokenizer tokenizer=new StringTokenizer(str, " ");
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}	
		System.out.println("------------------");
		String str1="Hello,Java,world";
		StringTokenizer tokenizer1=new StringTokenizer(str1);
		while (tokenizer1.hasMoreTokens()) {
			System.out.println(tokenizer1.nextToken());
		}
		System.out.println("------------------");
		String str2="Hello Java world";
		StringTokenizer tokenizer2=new StringTokenizer(str2, " ",false);
		while (tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}	
	}
}
