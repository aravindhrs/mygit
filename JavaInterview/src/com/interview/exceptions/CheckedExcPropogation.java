package com.interview.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExcPropogation {
	static FileInputStream inputStreamReader  = null;
	public static void methodA() throws IOException{
		File file = new File("C:\\Users\\aravindh\\Desktop\\Thanni_Kodam_Eduthuu-StarMusiQ.Com.mp3");
		inputStreamReader = new FileInputStream(file);
		System.out.println(inputStreamReader.getFD());
	}
	
	public static void callA() throws IOException{
		methodA();
	}
	
	public static void main(String[] args){
		try {
			callA();
		} catch (IOException e) {
			System.out.println("Exception Handled!!!");
			e.printStackTrace();
			System.out.println("Exit of Catch!!!");
		}
		finally {
			try {
				System.out.println("Inside try of finally!!!");
				if(inputStreamReader!=null)
					inputStreamReader.close();
				else
					System.out.println("Reader not opened!!!");
				System.out.println("Resources Closed!!!");
			} catch (IOException e) {
				System.out.println("Resources not osed!!!");
				e.printStackTrace();
			}
		}
	}
}
