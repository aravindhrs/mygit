package com.interview.strings;

public class StringBuilderAppend {
	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder("Hello");
		StringBuilder stringBuilder1=new StringBuilder("Hello");
		System.out.println(stringBuilder1.equals(stringBuilder));
		stringBuilder.append(" Java");
		System.out.println(stringBuilder.toString());
		stringBuilder.insert(0, "Welcome! ");
		System.out.println(stringBuilder.toString());
		stringBuilder.replace(3, 4, "l C");
		System.out.println(stringBuilder.toString());
		stringBuilder.deleteCharAt(stringBuilder.toString().length()-1);
		System.out.println(stringBuilder.toString());
		System.out.println(stringBuilder.charAt(stringBuilder.toString().length()-4));
		System.out.println(stringBuilder.charAt(stringBuilder.toString().length()-1));		
		System.out.println(stringBuilder.toString().length());
		stringBuilder.delete(stringBuilder.toString().length()-4, stringBuilder.toString().length());
		System.out.println(stringBuilder.toString());
	}
}
