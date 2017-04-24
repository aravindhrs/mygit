package com.interview.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
	public static void main(String[] args) {
		try{
			StudentInfo info = new StudentInfo("Aravindh", 10, "Tamilnadu");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\aravindh\\Desktop\\Student.ser"));
			oos.writeObject(info);
			oos.close();
			System.out.println("Serialize done!!!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
