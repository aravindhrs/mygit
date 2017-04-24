package com.interview.threads;

public class ThreadDefine implements Runnable{
	
	public int i=10;
	protected String k="king";

	public void run(){
		System.out.println("Hello from a thread!!!");
	}
	
	public void reflectionMethodCall(){
		System.out.println("reflectionMethodCall with Class.forName method()");
	}
	
	public static void main(String[] args) {
		new Thread(new ThreadDefine()).start();
	}
}