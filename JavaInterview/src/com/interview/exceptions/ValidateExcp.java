package com.interview.exceptions;

import java.io.IOException;

class Excp{
	public void msg() throws IOException{
		System.out.println("parent");
		throw new IOException();
	}
}

class child extends Excp{
	public void msg() throws ArithmeticException, IOException{
		Excp excp = new child();
		excp.msg();
		System.out.println("child");
	}
}
public class ValidateExcp extends child{
	public static void main(String[] args) throws ArithmeticException, IOException {
		child child=new child();
		child.msg();
	}
}
