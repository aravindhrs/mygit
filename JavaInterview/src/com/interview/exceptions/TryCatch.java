package com.interview.exceptions;

import javax.swing.JViewport;

public class TryCatch {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		try{
			int[] iw = new int[2];
			iw[2] = 30/0;
			JViewport jViewport = new JViewport();
		}catch (ArithmeticException e) {
			System.out.println("Exception:::"+e.getMessage());
		}
	}
}
