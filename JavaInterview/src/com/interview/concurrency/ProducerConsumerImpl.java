package com.interview.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerImpl {
	private static final int CAPACITY = 10;
	private final Queue<Integer> queue = new LinkedList<>();
	private final Random random = new Random();
	
	private final Lock aLock = new ReentrantLock(true);
	private final Condition consumer = aLock.newCondition();
	private final Condition producer = aLock.newCondition();
	
	public void put() throws InterruptedException{
		aLock.lock();
		try{
			while(queue.size()==CAPACITY){
				System.out.println(Thread.currentThread().getName()+" : buffer is full, waiting(Producer will wait)");
				producer.await();
			}
			int number = random.nextInt();
			boolean isAdded = queue.offer(number);
			if(isAdded){
				System.out.printf("%s added %d into queue %n", Thread.currentThread().getName(), number);
				System.out.println(Thread.currentThread().getName() + " : Signalling that buffer is no more empty now");
				consumer.signalAll();
			}
		}finally {
			aLock.unlock();
		}
	}
	
	public void get() throws InterruptedException{
		aLock.lock();
		try{
			while (queue.size()==0) {
				System.out.println(Thread.currentThread().getName()+" : buffer is empty, waiting(Consumer will wait)");
				consumer.await();
			}
			Integer value = queue.poll();
			if(value!=null){
				System.out.printf("%s consumed %d from queue %n", Thread.currentThread().getName(), value);
				System.out.println(Thread.currentThread().getName() + " : Signalling that buffer may be empty now");
				producer.signalAll();
			}
		}finally {
			aLock.unlock();
		}
	}
}
