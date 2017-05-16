package com.interview.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileChannelforCopy {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws IOException {
		File sourceFile = null;
		File destFile = null;
		FileChannel srcChannel = null;
		FileChannel destChannel = null;
		try {
			sourceFile = new File("D:\\GitHub\\JavaInterview\\src\\Hello1.txt");
			destFile = new File("D:\\GitHub\\JavaInterview\\src\\Hello2.txt");
			
			srcChannel = new FileInputStream(sourceFile).getChannel();			
			destChannel = new FileOutputStream(destFile).getChannel();
			System.out.println(srcChannel.size());
			destChannel.transferFrom(srcChannel, 0, srcChannel.size());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			srcChannel.close();
			destChannel.close();
		}
		
		FileChannelforCopy.copy(sourceFile.getAbsolutePath(), destFile.getAbsolutePath());
	}
	
	public static void copy(String sourcePath, String destinationPath) throws IOException {
	    Files.copy(Paths.get(sourcePath), new FileOutputStream(destinationPath));
	}
}
