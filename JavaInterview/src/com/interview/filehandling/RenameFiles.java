package com.interview.filehandling;

import java.io.File;

public class RenameFiles {
	public static void main(String[] args) {
		File dir = new File("D://Media//Eng-MP3//");
		if (dir.isDirectory()) {
			for (final File f : dir.listFiles()) {
				System.out.println(f);
				try {
					if (f.getName().contains(".jpg")) {
						f.delete();
						System.out.println("File deleted:" + f.toString());
					}
					if (f.toString().contains("--yoodownload.com")) {
						String str = f.toString().replace("--yoodownload.com", "");
						File newfile = new File(str);

						if (f.renameTo(newfile)) {
							System.out.println("Rename succesful");
						} else {
							System.out.println("Rename failed");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // for
		}
	}
}
