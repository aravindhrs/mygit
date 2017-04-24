package com.interview.threads;

public class ThreadJoin extends Thread{
	public void run(){
		System.out.println("r1 ");
   		try {
    		Thread.sleep(500);
		}catch(InterruptedException ie){ } 
   		System.out.println("r2 ");
	}
	
	public static void main(String[] args) {
		ThreadJoin tJoin1 = new ThreadJoin();
		ThreadJoin tJoin2 = new ThreadJoin();
		ThreadJoin tJoin3 = new ThreadJoin();
		ThreadJoin tJoin4 = new ThreadJoin();
		tJoin1.start();
		try{
			tJoin1.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		tJoin2.start();
		try{
			tJoin2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		tJoin3.start();
		try{
			tJoin3.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		tJoin4.start();
	}
}
