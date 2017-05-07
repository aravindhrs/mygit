package com.interview.strings;

class Capitalize{
	public static String capWord(String str){
		String[] stArr = str.split("\\s"); 
		StringBuilder capWord = new StringBuilder();
		for(String s:stArr){
			String first = s.substring(0, 1);
			String last = s.substring(1);
			capWord.append(first.toUpperCase()).append(last.toLowerCase()).append(" ");
		}
		return capWord.toString();
	}
}

public class CapitalizeWord {
	public static void main(String[] args) {
		System.out.println(Capitalize.capWord("i wILl get job in payPal tomorrow"));
	}
}
