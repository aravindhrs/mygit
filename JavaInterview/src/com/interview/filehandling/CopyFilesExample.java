package com.interview.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FileUtils;

public class CopyFilesExample {
	public static void main(String[] args) throws InterruptedException, IOException {

		File source = new File("D:\\GitHub\\JavaInterview\\files\\Hello1.txt");
		File dest = new File("D:\\GitHub\\JavaInterview\\files\\destfile1.txt");

		// copy file using FileStreams
		long start = System.nanoTime();
		long end;
		
		copyFileUsingFileStreams(source, dest);
		System.out.println("Time taken by FileStreams Copy = " + (System.nanoTime() - start));

		// copy files using java.nio.FileChannel
		source = new File("D:\\GitHub\\JavaInterview\\files\\Hello1.txt");
		dest = new File("D:\\GitHub\\JavaInterview\\files\\destfile2.txt");
		start = System.nanoTime();
		copyFileUsingFileChannels(source, dest);
		end = System.nanoTime();
		System.out.println("Time taken by FileChannels Copy = " + (end - start));

		// copy file using Java 7 Files class
		source = new File("D:\\GitHub\\JavaInterview\\files\\Hello1.txt");
		dest = new File("D:\\GitHub\\JavaInterview\\files\\destfile3.txt");
		start = System.nanoTime();
		copyFileUsingJava7Files(source, dest);
		end = System.nanoTime();
		System.out.println("Time taken by Java7 Files Copy = " + (end - start));

		// copy files using apache commons io
		source = new File("D:\\GitHub\\JavaInterview\\files\\Hello1.txt");
		dest = new File("D:\\GitHub\\JavaInterview\\files\\destfile4.txt");
		start = System.nanoTime();
		copyFileUsingApacheCommonsIO(source, dest);
		end = System.nanoTime();
		System.out.println("Time taken by Apache Commons IO Copy = " + (end - start));
	}

	private static void copyFileUsingFileStreams(File source, File dest) throws IOException {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(dest);
			byte[] buf = new byte[1024];//reads data from 0 to 1024 bytes
			int bytesRead;			
			while ((bytesRead = input.read(buf)) > 0) {
				//System.out.println(input.read(buf));
				//System.out.println("Buffer:"+buf.length);
				output.write(buf, 0, bytesRead);
			}
			while ((bytesRead = input.read()) != -1){
				/*Reads the next byte of data from the input stream. 
				The value byte is returned as an int in the range 0 to 255.*/
				//System.out.println(input.read());
				output.write((char) bytesRead);
			}
		} finally {
			input.close();
			output.close();
		}
	}

	@SuppressWarnings("resource")
	private static void copyFileUsingFileChannels(File source, File dest) throws IOException {
		FileChannel inputChannel = null;
		FileChannel outputChannel = null;
		try {
			inputChannel = new FileInputStream(source).getChannel();
			outputChannel = new FileOutputStream(dest).getChannel();
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} finally {
			inputChannel.close();
			outputChannel.close();
		}
	}

	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
		Files.copy(source.toPath(), dest.toPath(),StandardCopyOption.REPLACE_EXISTING );
		
		Files.copy(Paths.get(source.getAbsolutePath()), new FileOutputStream(dest.getAbsolutePath()));
		Files.copy(source.toPath(), new FileOutputStream(dest.getAbsolutePath()));
	}

	private static void copyFileUsingApacheCommonsIO(File source, File dest) throws IOException {
		FileUtils.copyFile(source, dest);
	}
}