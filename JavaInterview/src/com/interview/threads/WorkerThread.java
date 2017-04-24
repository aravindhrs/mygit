package com.interview.threads;

public class WorkerThread implements Runnable{

	private String message;
	
	public WorkerThread(String msg){
		this.message=msg;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" (start) message="+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+" (End) message");
	}
	
	private void processMessage(){
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}