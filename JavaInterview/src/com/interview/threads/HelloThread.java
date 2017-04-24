package com.interview.threads;

public class HelloThread extends Thread{

	public void run(){
		System.out.println("Hello from a thread!!!");
	}
	public static void main(String[] args) {
		System.out.println("Hi");
		new HelloThread().start();
	}

}
