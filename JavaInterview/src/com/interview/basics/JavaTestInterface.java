package com.interview.basics;

interface Drawable{
	void draw();
	default void msg(){
		System.out.println("Default method!!!");
	}
	
	static int cube(int x){
		return x*x*x;
	}
}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle!!!");
	}	
	public void msg(){
		System.out.println("Interface default message overridden");
	}	
}

public class JavaTestInterface {
	public static void main(String[] args) {
		Drawable drawable = new Rectangle();
		drawable.msg();
		drawable.draw();
		System.out.println("Cube of 10: "+Drawable.cube(10));
	}
}
