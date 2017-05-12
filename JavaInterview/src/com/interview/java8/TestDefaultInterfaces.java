package com.interview.java8;

public class TestDefaultInterfaces implements DefaultMethodInt1, DefaultMethodInt2 {

	@Override
	public void defaultMethod() {
		DefaultMethodInt1.super.defaultMethod();
	}
	
	public static void main(String[] args) {
		new TestDefaultInterfaces().defaultMethod();
	}
}
