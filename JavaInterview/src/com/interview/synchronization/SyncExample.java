package com.interview.synchronization;

public class SyncExample {
	public static void main(String[] args) {
		Table table = new Table();
		MyThread1 thread1 = new MyThread1(table);
		MyThread2 thread2 = new MyThread2(table);
		thread1.start();
		thread2.start();
	}
}

class Table{
	public synchronized void printMultiples(int n){
		for(int i=1;i<6;i++){
			try{
				if(((n*i) == 30)||((n*i) == 200)){
					Thread.sleep(2000);
					System.out.println(n*i);
				}
				else{
					Thread.sleep(300);
					System.out.println(n*i);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	Table t;
	public MyThread1(Table tbl) {
		this.t = tbl;
	}
	
	public void run(){
		t.printMultiples(10);
	}
}

class MyThread2 extends Thread{
	Table t;
	public MyThread2(Table tbl) {
		this.t = tbl;
	}
	
	public void run(){
		t.printMultiples(100);
	}
}