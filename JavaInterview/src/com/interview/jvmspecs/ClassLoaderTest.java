package com.interview.jvmspecs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderTest {
	public static void main(String[] args) {
		try {
			String fullClassName="com.interview.jvmspecs.HelloWorld";
			String param1 = "Java";
			ClassLoader classLoader = ClassLoader.getSystemClassLoader();
			Class<?> myClass = classLoader.loadClass(fullClassName);
			Method myMethod = myClass.getMethod("printMsg", new Class[] { String.class });
			Object myClassObject = myClass.newInstance();
			String returnValue = (String) myMethod.invoke(myClassObject, new Object[] { param1 });
			System.out.println("The value returned from the method is:"+ returnValue);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException
				| SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
