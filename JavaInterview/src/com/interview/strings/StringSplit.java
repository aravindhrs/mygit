package com.interview.strings;

public class StringSplit {
	public static void main(String args[]){  
		String s1="welcome to split world hi";  
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
			System.out.println(w);  
		}  
		System.out.println("----------------------");
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
			System.out.println(w);  
		}  
		System.out.println("----------------------");
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
			System.out.println(w);  
		} 
		
		System.out.println("----------------------");
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",3)){  
			System.out.println(w);  
		}  
		
		System.out.println("----------------------");
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",4)){  
			System.out.println(w);  
		}  
		
		String s=null;
		String ss="hello";

		System.out.println(s+ss);
	}
}
