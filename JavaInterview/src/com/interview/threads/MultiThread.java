package com.interview.threads;

public class MultiThread {
	public static void main(String[] args) {
		for(int i=0;i<8;i++){
			MultithreadingDemo demoThread = new MultithreadingDemo();
			demoThread.start();
		}
	}
}
