package com.interview.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Exc{
	public void a()  {
		System.out.println("Exception thrown");
		throw new RuntimeException();
	}
	
	public void b(){
		try {
			a();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
public class ExceptionPropogation {
	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args){
		new Exc().b();
		System.out.println("Exception done");
		@SuppressWarnings("rawtypes")
		List al=new ArrayList<String>();
		Iterator<String> itr = al.iterator();
	}
}
