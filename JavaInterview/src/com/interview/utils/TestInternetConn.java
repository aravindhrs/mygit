package com.interview.utils;

import java.net.URL;
import java.net.URLConnection;

import com.mongodb.annotations.ThreadSafe;

@ThreadSafe
public class TestInternetConn {
	public static void main(String[] args) {
		try 
		{
			URL url = new URL("http://www.beeg.com");		 
		   	URLConnection connection = url.openConnection();
		   	connection.connect();		 
		   	System.out.println("Internet Connected");		
		   	System.out.println(connection.getReadTimeout());
		 }catch (Exception e){		     
			 System.out.println("Sorry, No Internet Connection");		                                                            
		} 
	}
}
