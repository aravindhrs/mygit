package com.interview.threads;

public class DaemonThread extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon Thread");
		}else{
			System.out.println("User thread");
		}
	}
	public static void main(String[] args) {
		DaemonThread daemonThread1 = new DaemonThread();
		DaemonThread daemonThread2 = new DaemonThread();
		DaemonThread daemonThread3 = new DaemonThread();
		
		//daemonThread1.start();
		daemonThread1.setDaemon(true);
		daemonThread1.start();
		daemonThread2.start();
		daemonThread3.start();
	}
}
