package com.interview.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ObjectCreationMethods implements Cloneable, Serializable {
	 
	private static final long serialVersionUID = 1L;
 
	public ObjectCreationMethods() {
		log("Hello! ObjectCreationMethods() just got created without args..");
	}
	
	public ObjectCreationMethods(String s) {
		this();
		log("Hello! ObjectCreationMethods() just got created with args.."+s);
	}
 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (ObjectCreationMethods) super.clone();
	}
 
	@SuppressWarnings({ "unused", "resource", "rawtypes" })
	public static void main(String[] args) throws Exception {
 
		// Create Object1
		ObjectCreationMethods object1 = new ObjectCreationMethods();
 
		// Create Object2
		ObjectCreationMethods object2 = (ObjectCreationMethods) Class.forName("com.interview.basics.ObjectCreationMethods").newInstance();
 
		// Create Object3
		ObjectCreationMethods secondObject = new ObjectCreationMethods();
		ObjectCreationMethods object3 = (ObjectCreationMethods) secondObject.clone();
 
		// Create Object4
		Object object4 = ObjectCreationMethods.class.getClassLoader().loadClass("com.interview.basics.ObjectCreationMethods").newInstance();
 
		// Create Object5: Create a new file with an ObjectOutputStream
		FileOutputStream out = new FileOutputStream("ObjectCreationMethods.txt");
		ObjectOutputStream oout = new ObjectOutputStream(out);
		oout.writeObject(object4); // write object4 to file
		oout.flush();
 
		// create an ObjectInputStream for the file we created before
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectCreationMethods.txt"));
		ObjectCreationMethods object5 = (ObjectCreationMethods) ois.readObject();
		log(object5.toString());
 
		// Create Object6: use the Constructor class from the java.lang.reflect
		Class clazz = ObjectCreationMethods.class;
		Constructor crunchifyCon = clazz.getDeclaredConstructors()[0];
		ObjectCreationMethods obj = (ObjectCreationMethods) crunchifyCon.newInstance();
		
		Constructor<?> cons = ObjectCreationMethods.class.getDeclaredConstructors()[1];
		ObjectCreationMethods creationMethods = (ObjectCreationMethods) cons.newInstance(" Welcome!!!");
	}
 
	private static void log(String object) {
		System.out.println(object.toString()); 
	}
}