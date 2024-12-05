package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\sarthak\\Desktop\\file.txt";

		try {
			FileInputStream in = new FileInputStream(filePath);

			int data = 0;

			while ((data = in.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
