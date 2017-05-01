package com.interview.basics;

public class DataTypeConversion {
	static int i=10;
	public static void main(String[] args) {
		String s = String.valueOf(i);
		System.out.println("ValueOf:"+s);
		System.out.println("format:"+String.format("%d", i));
	}
}
