package com.interview.strings;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GetCharsExample {
	public static void main(String[] args) {
		String str="Hello";
		char[] chArr=new char[10];
		str.getChars(3, 4, chArr, 5);
		
		for (char c : chArr) {
			System.out.print(c);
		}
		
		System.out.println("GetCharsExample.class.getClassLoader():::"+GetCharsExample.class.getClassLoader());
		try {
			ClassLoader classLoader = ClassLoader.getSystemClassLoader().getParent();
			System.out.println(classLoader.toString());
			Class.forName("com.interview.strings", true, GetCharsExample.class.getClassLoader().getParent().getParent());
		} catch (ClassNotFoundException e) {
			Logger.getLogger(GetCharsExample.class.getName()).log(Level.SEVERE, null, e);
			//e.printStackTrace();
		}
	
	}
}
