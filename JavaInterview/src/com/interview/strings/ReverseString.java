package com.interview.strings;

public class ReverseString {
	public static String getReverseString(String str){
	   StringBuffer strBuffer = new StringBuffer(str.length());
	   for(int counter=str.length() -1 ; counter>=0;counter--){
	      strBuffer.append(str.charAt(counter));
	   } 
	   return strBuffer.toString();
	}

	public static String getReverseStringRecursive(String str){
	   if(str.length() <= 1){
	      return str;
	   }System.out.println(str.substring(1)+"--"+str.charAt(0));
	   return (getReverseStringRecursive(str.substring(1))+str.charAt(0));
	} 
	
	public static void main(String[] args) {
		System.out.println(getReverseStringRecursive("King"));
		System.out.println("----------");
		System.out.println(getReverseString("King is king kong"));
		System.out.println("Substring:".substring(0));
	}
}
