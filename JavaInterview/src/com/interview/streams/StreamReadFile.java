package com.interview.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamReadFile {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		File file = null;
		BufferedReader bufferedReader = null;
		try {
			file = new File("C:\\Users\\aravindh\\Desktop\\RentBalance.txt");
			bufferedReader = new BufferedReader(new FileReader(file));
			String str;
			while((str=bufferedReader.readLine())!=null){
				System.out.println(str);	
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
		finally{
			file.createTempFile("C:\\Users\\aravindh\\Desktop\\Asr", ".pdf");
			bufferedReader.close();
		}
	}
}
