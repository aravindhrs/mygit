package com.interview.strings;

public class StringArgs {
	public static void main(String[] args) {
		test(9,"");
		test(10,"fuck");
		test(20,"fuck","you");
	}

	public static void test(int a, String... args){
		System.out.println("***Count of String Variables:"+args.length);
		for (String string : args) {
			System.out.println("Length of String Variable:"+string.length());
		}
		System.out.println("--------------");
	}
}
