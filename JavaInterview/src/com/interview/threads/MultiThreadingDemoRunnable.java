package com.interview.threads;

public class MultiThreadingDemoRunnable implements Runnable{
	public void run(){
		try{
			System.out.println("Thread "+Thread.currentThread().getId()+" is running...");
		}catch(Exception ex){
			ex.printStackTrace();
		}		
	}
}
