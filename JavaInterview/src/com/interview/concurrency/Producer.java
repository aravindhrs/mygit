package com.interview.concurrency;

public class Producer extends Thread{
	ProducerConsumerImpl impl;
	public Producer(ProducerConsumerImpl sharedObject){
		super("PRODUCER");
		this.impl = sharedObject;
	}
	
	public void run(){
		try{
			impl.put();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
