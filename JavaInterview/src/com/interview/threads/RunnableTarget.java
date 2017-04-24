package com.interview.threads;

public class RunnableTarget {
	public static void main(String[] args) {
		ThreadGroupDemo runnableTarget = new ThreadGroupDemo();
		
		ThreadGroup threadGroup = new ThreadGroup("Parent ThreadGroupDemo");
		
		Thread thread1 = new Thread(threadGroup, runnableTarget, "Thread1");
		thread1.start();
		
		Thread thread2 = new Thread(threadGroup, runnableTarget, "Thread2");
		thread2.start();
		
		Thread thread3 = new Thread(threadGroup, runnableTarget, "Thread3");
		thread3.start();
		
		System.out.println("Threadgroup Name: "+threadGroup.getName());
		threadGroup.list();
	}
}
