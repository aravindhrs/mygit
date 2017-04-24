package com.interview.basics;

public class ArrayClassName {
	public static void main(String[] args) {
		char[] u={'4','5','6','7'};
		char []k= new char[2];
		
		System.arraycopy(u, 1, k, 0, 2);
		System.out.println(new String(k));
	}
}
