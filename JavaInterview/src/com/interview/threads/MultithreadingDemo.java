package com.interview.threads;

public class MultithreadingDemo extends Thread{
	public void run(){
		try{
			System.out.println("Thread "+Thread.currentThread().getId()+" is running...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
