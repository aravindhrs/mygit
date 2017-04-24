package com.interview.strings;

public class ChkAlphabets {
	public static void main(String[] args) {
		int index = 0;
		char[] lwarray = new char[26];
		char[] uparray = new char[26];
		StringBuilder builder=new StringBuilder();
		
		for (char c = 'h'; c <= 'k'; c++) {
			lwarray[index++] = c;
		}
		String result = new String(lwarray).trim();		
		byte[] lIntVal = result.getBytes();
		
		String upCaseStr = result.toUpperCase();
		upCaseStr.getChars(0, upCaseStr.length(), uparray, 0);
		byte[] upIntVal = upCaseStr.getBytes();
		
		for (int i = 0; i < lIntVal.length; i++) {
			builder.append(lwarray[i]+":"+lIntVal[i]+","+uparray[i]+":"+upIntVal[i]+",");
		}
		System.out.println(builder.deleteCharAt(builder.lastIndexOf(",")).toString());
	}
}
