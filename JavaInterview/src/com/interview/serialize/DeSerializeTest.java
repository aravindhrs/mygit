package com.interview.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeTest {
	public static void main(String[] args) {
		StudentInfo info = null;
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\aravindh\\Desktop\\Student.ser"));
			info = (StudentInfo) ois.readObject();
			ois.close();
			System.out.println(info.id);
			System.out.println(info.name);
			System.out.println(StudentInfo.contact);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
