package FileHandling;

import java.io.File;

// file handling.

public class FileInfo {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\sarthak\\Desktop\\file.txt";

		File filee = new File(filePath);

		if (filee.exists()) {
			System.out.println("file is Present!!");
			System.out.println("File Name: " + filee.getName());
			System.out.println("File Path: " + filee.getAbsolutePath());
			System.out.println("Can Read: " + filee.canRead());
			System.out.println("Can Write: " + filee.canWrite());
			System.out.println("Can Execute: " + filee.canExecute());
		} else {
			System.out.println("file is not present!!!!");
		}
	}

}
