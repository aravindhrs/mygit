package com.interview.threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLocktest {
	private final ReentrantLock lock=new ReentrantLock();
	private int count=0;
	
	public int getCount(){
		lock.lock();
		try{
			System.out.println(Thread.currentThread().getName()+" gets count:"+count);
			System.out.println("Waiting "+lock.getQueueLength());
			return count++;
		}finally {
			lock.unlock();
		}
	}
	
	public synchronized int getCount2(){
		return count++;
	}
	static public void main(String[] args) {
		final ReEntrantLocktest counter = new ReEntrantLocktest();
		
		Thread t1=new Thread("Thread1"){
			public void run(){
				while(counter.getCount()<6){
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2=new Thread("Thread2"){
			public void run(){
				while(counter.getCount()<6){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
