package com.interview.basics;


class Modifyiers{
	void show(){
		System.out.println("fuck u");
	}
}
public class AccessModifiers extends Modifyiers{
	protected void show(){
		super.show();
		System.out.println("asshole");
	}
	
	public static void main(String[] args) {
		new AccessModifiers().show();
	}
}
