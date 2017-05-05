package com.interview.strings;

public class ImmutableString {
	public static void main(String[] args) {
		String str="Parents";
		str.concat(" in Home");
		System.out.println(str);
		str=str.concat(" in Home");
		System.out.println(str);
	}
}
