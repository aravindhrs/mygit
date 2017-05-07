package com.interview.jvmspecs;

public class Main extends ClassLoader {	
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException, InstantiationException {
		ClassLoader parentClassLoader = MyClassLoader.class.getClassLoader();
		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
		Class myObjectClass = classLoader.loadClass("com.interview.strings.GetCharsExample");
	
		AnInterface2 object1 = (AnInterface2) myObjectClass.newInstance();
	
		MyObjectSuperClass object2 = (MyObjectSuperClass) myObjectClass.newInstance();
	
		// Create new class loader so that the classes can be reloaded.
		classLoader = new MyClassLoader(parentClassLoader);
		myObjectClass = classLoader.loadClass("com.interview.strings.GetCharsExample");
	
		object1 = (AnInterface2) myObjectClass.newInstance();
		object2 = (MyObjectSuperClass) myObjectClass.newInstance();
	}
}
