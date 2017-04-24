package com.interview.reflections;

import java.io.Serializable;
import java.lang.reflect.Method;

class FooPrint{
	public void printNP(){
		System.out.println("Hello Java");
	}	
	public void print(String s){
		System.out.println("Hello Java "+s);
	}	
	public void display(String s, int n){
		System.out.println("Hello Java "+s+" ,Count: "+n++);
	}
}

class FooPrint1 implements Serializable{
	private static final long serialVersionUID = -5078302234572762279L;

	public static void show(){
		System.out.println("Using Class.forName method invoke");
	}
	
	public void show1(String h){
		System.out.println("Using Class.forName method invoke: "+h);
	}
}

public class MethodReflect {
	public static void main(String[] args) {
		FooPrint fooPrint = new FooPrint();
		
		Class<?>[] paramString = new Class[1];
		paramString[0] = String.class;
		
		Class<?>[] noParams = {};
		
		Class<?>[] mixParams = new Class[2];
		mixParams[0] = String.class;
		mixParams[1] = Integer.TYPE;
		
		Method method;
		String in="Programming";
		
		Object[] obj = {"Programming",1};
		try{
			Class<?> cls = Class.forName("com.interview.reflections.FooPrint1");
			Object object = cls.newInstance();
			
			method = cls.getDeclaredMethod("show",noParams);
			method.invoke(object);
			System.out.println("2------------------");
			method = cls.getMethod("show1", paramString);
			method.invoke(object, new String("Reflection"));
			System.out.println("3------------------");
			method = fooPrint.getClass().getMethod("print", paramString);
			method.invoke(fooPrint,in);
			System.out.println("4------------------");
			method = fooPrint.getClass().getDeclaredMethod("printNP");
			method.invoke(fooPrint);
			System.out.println("5------------------");
			method = fooPrint.getClass().getMethod("display", mixParams);
			method.invoke(fooPrint, obj);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}