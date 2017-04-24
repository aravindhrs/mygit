package com.interview.synchronization;

public class SyncBlock {
	public static void main(String[] args) {
		Table1 table = new Table1();
		MyThread11 thread1 = new MyThread11(table);
		MyThread22 thread2 = new MyThread22(table);
		thread1.start();
		thread2.start();
	}
}

class Table1{
	void printMultiples(int n){
		synchronized (this) {
			for(int i=1;i<6;i++){
				try{
					if(((n*i) == 30)||((n*i) == 200)){
						Thread.sleep(2000);
						System.out.println(n*i);
					}
					else{
						Thread.sleep(1000);
						System.out.println(n*i);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MyThread11 extends Thread{
	Table1 t;
	public MyThread11(Table1 table) {
		this.t = table;
	}
	
	public void run(){
		t.printMultiples(10);
	}
}

class MyThread22 extends Thread{
	Table1 t;
	public MyThread22(Table1 table) {
		this.t = table;
	}
	
	public void run(){
		t.printMultiples(100);
	}
}