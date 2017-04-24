package com.interview.strings;

public class RegionMatches {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="ell";
		System.out.println(str1.regionMatches(true, 1, str2, 0, 3));
		char[] chr={'a','b','c','d','e'};
		str2=String.copyValueOf(chr, 1, 4);
		System.out.println(str2);
		char[] ch=new char[4];
		str2.getChars(1, 4, ch, 0);
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			//ch[i]='';
			System.out.println(ch[i]);
		}
		
		String str3="Hello World";
		byte[] barr = str3.getBytes(); 
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
	}
}
