package com.interview.basics;

public class StaticVariable extends Thread{
	static int count=0;
	@SuppressWarnings("static-access")
	public StaticVariable(){
		count++;
		System.out.println("Count of objects after " +count+" invoke: "+count);
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void inc(){
		count++;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StaticVariable staticVariable1=new StaticVariable();
		StaticVariable staticVariable2=new StaticVariable();
		StaticVariable staticVariable3=new StaticVariable();
		/*staticVariable.inc();
		System.out.println(count);//1
		staticVariable2.inc();
		System.out.println(count);//2
		staticVariable2.inc();
		System.out.println(count);*///3
	}
}
