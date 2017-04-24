package com.interview.threads;

public class ThreadGroupDemo implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}