package com.interview.threads;

public class DeadLockFixed extends Thread{
	/**
	 * * Both method are now requesting lock in same order, first Integer and
	 * then String. * You could have also done reverse e.g. first String and
	 * then Integer, * both will solve the problem, as long as both method are
	 * requesting lock * in consistent order.
	 */
	
	public DeadLockFixed(String name){
		super(name);
		Thread.currentThread().setName(name);		
	}
	
	public void method1() {
		synchronized (Integer.class) {
			System.out.println("Method1:Aquired lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Method1:Aquired lock on String.class object");
			}
		}
	}

	public void method2() {
		synchronized (String.class) {
			System.out.println("Method2:Aquired lock on Integer.class object");
			synchronized (Integer.class) {
				System.out.println("Method2:Aquired lock on String.class object");
			}
		}
	}
	
	public void run(){
		System.out.println("Current thread:"+Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("deadLockFixed1")){
			method1();
		}else{
			method2();
		}
	}
	
	public static void main(String[] args) {
		DeadLockFixed deadLockFixed1 = new DeadLockFixed("deadLockFixed1");
		DeadLockFixed deadLockFixed2 = new DeadLockFixed("deadLockFixed2");
		deadLockFixed1.start();
		deadLockFixed2.start();
	}
}
