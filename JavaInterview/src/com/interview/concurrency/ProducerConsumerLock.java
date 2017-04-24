package com.interview.concurrency;

public class ProducerConsumerLock {
	public static void main(String[] args) {
		ProducerConsumerImpl sharedObject = new ProducerConsumerImpl();
		Producer producer = new Producer(sharedObject);
		Consumer consumer = new Consumer(sharedObject);
		
		consumer.start();
		producer.start();
		producer.run();
	}
}