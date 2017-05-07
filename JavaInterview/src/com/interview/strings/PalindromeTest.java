package com.interview.strings;

public class PalindromeTest {
	public static boolean palindromeCheck(String str){		
		if(str.equals(new StringBuilder(str).reverse().toString())){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(PalindromeTest.palindromeCheck("nitin"));
	}
}