package com.interview.threads;

public class MyThread extends Thread{
	private int startdIdx,nThreads,maxIdx;
	
	public MyThread(int s, int n, int m){
		this.startdIdx=s;
		this.nThreads=n;
		this.maxIdx=m;
	}
	
	public void run(){
		for(int i=this.startdIdx;i<this.maxIdx;i+=this.nThreads){
			System.out.println("[ID "+this.getId()+"] "+i);
			Thread.yield();
		}
	}
}
