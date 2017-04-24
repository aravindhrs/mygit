package com.interview.collectionspkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fileReader=new FileReader(new File("C:\\EclipseWorkspaces\\JavaInterview\\src\\login.properties"));
			Properties properties=new Properties();
			properties.load(fileReader);
			System.out.println(properties.getProperty("username"));
			System.out.println(properties.getProperty("password"));
			System.out.println("-----------");
			Properties properties2=System.getProperties();
			Set<Entry<Object, Object>> set = properties2.entrySet();
			Iterator<Entry<Object, Object>> iterator=set.iterator();
			while (iterator.hasNext()) {
				Map.Entry<Object, Object> entry=(Map.Entry<Object, Object>)iterator.next();
				System.out.println(entry.getKey()+" = "+entry.getValue());  
			}
			properties2.store(new FileWriter(new File("C:\\EclipseWorkspaces\\JavaInterview\\src\\info.properties")),"Properties Example");  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
