package com.interview.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String text = reader.readLine();
			System.out.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
