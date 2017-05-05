package com.interview.strings;

public class StringLiteraltest {
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		String d = c;
		String e = new String("hello");
		System.out.println("a==b:::"+(a==b));
		System.out.println("a.equals(b)-->"+(a.equals(b)));
		System.out.println("a==c-->"+(a==c));
		System.out.println("c==d -->"+(c==d));
		System.out.println("c.equals(d) -->"+(c.equals(d)));
		System.out.println("c==e-->"+(c==e));
		System.out.println("c.equals(e)--->"+(c.equals(e)));
	}
}
