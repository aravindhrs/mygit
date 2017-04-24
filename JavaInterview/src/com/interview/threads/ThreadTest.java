package com.interview.threads;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread(0, 3, 300);
		MyThread myThread2 = new MyThread(1, 3, 300);
		MyThread myThread3 = new MyThread(2, 3, 300);
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
		//myThread3.interrupt();
	}
}
