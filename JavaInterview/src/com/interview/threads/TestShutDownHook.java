package com.interview.threads;

import java.lang.reflect.Field;

public class TestShutDownHook{
	public static void main(String[] args){
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new MyThreadHook());
		
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try{
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		ThreadDefine dt = null;
		try {
			dt = (ThreadDefine) new TestShutDownHook().getClass().getClassLoader().loadClass("com.interview.threads.ThreadDefine").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		dt.reflectionMethodCall();
		
		try {
			Field[] m = (Field[]) new TestShutDownHook().getClass().getClassLoader().loadClass("com.interview.threads.ThreadDefine").getDeclaredFields();
			for (int i = 0; i < m.length; i++) {
				System.out.println("Declared fields: "+m[i]);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
			try {
				//Class<?> cls = Class.forName("com.interview.threads.ThreadDefine");
				ThreadDefine define = (ThreadDefine)Class.forName("com.interview.threads.ThreadDefine").newInstance();
				define.reflectionMethodCall();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
}

class MyThreadHook extends Thread{
	public void run(){
		System.out.println("Shut down hook completed!!!");
	}
	
	static{
		System.out.println("Hello");
	}
	
}