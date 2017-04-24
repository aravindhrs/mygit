package com.interview.basics;

class VisibilityParent{
	static void sleep(){
		System.out.println("Parent class");
	}
}

public class VisibilityCheck {
	static void sleep(){
		VisibilityParent.sleep();
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		sleep();
	}
}
