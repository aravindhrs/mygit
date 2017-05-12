package com.interview.filehandling;

import java.io.File;

public class RenameFiles {
	public static void main(String[] args) {
		File dir = new File("D://Media//Tamil MP3//");
		if (dir.isDirectory()){
		    for (final File f : dir.listFiles()){
		    	System.out.println(f);
		        try {
		            /*File newfile =new File("newfile.txt");
		            if(f.renameTo(newfile)){
		                System.out.println("Rename succesful");
		            }else{
		                System.out.println("Rename failed");
		            }*/
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}
	}
}
