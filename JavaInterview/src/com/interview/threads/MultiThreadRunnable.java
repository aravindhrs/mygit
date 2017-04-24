package com.interview.threads;

public class MultiThreadRunnable {
	public static void main(String[] args) {
		for(int i=0;i<8;i++){
			new Thread(new MultiThreadingDemoRunnable()).start();
		}
	}
}
