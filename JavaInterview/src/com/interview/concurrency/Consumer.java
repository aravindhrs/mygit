package com.interview.concurrency;

public class Consumer extends Thread{
	ProducerConsumerImpl impl;
	public Consumer(ProducerConsumerImpl sharedObject){
		super("CONSUMER");
		this.impl = sharedObject;
	}
	
	public void run(){
		try{
			impl.get();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
