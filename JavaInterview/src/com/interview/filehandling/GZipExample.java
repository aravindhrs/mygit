package com.interview.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipExample {
	public static void main(String[] args) {
		GZipExample zipObj = new GZipExample();
		zipObj.gzipMyFile();
	}

	public void gzipMyFile() {
		try {
			GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("B://Java/Myfile.gz"));
			FileInputStream fis = new FileInputStream("B://Java/Myfile.txt");
			byte[] buffer = new byte[1024];
			int length;
			while ((length = fis.read(buffer)) > 0) {
				gos.write(buffer, 0, length);
			}
			fis.close();
			gos.finish();
			gos.close();
			System.out.println("File Compressed!!");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
