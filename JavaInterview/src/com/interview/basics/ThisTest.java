package com.interview.basics;

public class ThisTest {
	public ThisTest(){
	}
	public void chk(){
		System.out.println("Called by this()");
	}
	
	public static void main(String[] args) {
		ThisTest test = new ThisTest();
	}
}
