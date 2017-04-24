package com.interview.synchronization;

public class SynchronizeTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		View view = new View();
		CallerThread cThread1 = new CallerThread(view, "Hello");
		CallerThread cThread2 = new CallerThread(view, "Welcome");
		CallerThread cThread3 = new CallerThread(view, "Java");
	}
}

class View{
	public void display(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1500);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class CallerThread extends Thread{
	String msg;
	View view;
	public CallerThread(View v, String m) throws InterruptedException{
		view=v;
		msg=m;
		start();
		join();
	}
	
	public void run(){
		//synchronized (view) {
			view.display(msg);
		//}
	}
}