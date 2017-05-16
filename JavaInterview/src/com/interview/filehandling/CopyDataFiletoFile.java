package com.interview.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFiletoFile {
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		int c;
		try {
			inputStream = new FileInputStream("D:\\GitHub\\JavaInterview\\src\\login.properties");
			outputStream = new FileOutputStream("D:\\GitHub\\JavaInterview\\src\\Hello1.txt");
			while ((c = inputStream.read()) != -1)
				outputStream.write((char) c);
			System.out.println("File is Copied");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}