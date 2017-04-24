package com.interview.networking;

import java.net.*;
public class NetworkingTest {
 public static void main(String[] args) throws UnknownHostException
 {
  InetAddress address = InetAddress.getLocalHost(); 
  System.out.println(address);
  address = InetAddress.getByName("www.studytonight.com");
  System.out.println(address);
  InetAddress sw[] = InetAddress.getAllByName("www.beeg.com");
  for(int i=0; i< sw.length; i++)
  {
   System.out.println(sw[i]);
  }
 }
}