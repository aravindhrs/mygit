package com.interview.basics;

public class ProxyArrayClass {
	public static void main(String[] args) {
		String[][][] arr = new String[5][5][1];
		int[][] in = new int[1][1]; 
		System.out.println(arr.getClass().getName());
		System.out.println(in.getClass().getName());
	}
}
