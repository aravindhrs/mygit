package com.interview.threads;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new MyClass(),"th1");
		Thread thread2 = new Thread(new MyClass(),"th2");
		Thread thread3 = new Thread(new MyClass(),"th3");
		
		thread1.start();
		try{
			thread1.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		thread2.start();
		try{
			thread2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		thread3.start();
		try{
			thread3.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("All the threads completed the execution!!!");
	}
}

class MyClass implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started:"+t.getName());
		try{
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended:"+t.getName()+"\n-------------------");
	}
	
}