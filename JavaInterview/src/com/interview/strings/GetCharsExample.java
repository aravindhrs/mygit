package com.interview.strings;

public class GetCharsExample {
	public static void main(String[] args) {
		String str="Hello";
		char[] chArr=new char[10];
		str.getChars(3, 4, chArr, 5);
		
		for (char c : chArr) {
			System.out.print(c);
		}
	}
}
