package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type Here.......");
		String data = sc.nextLine();

		String filePath = "C:\\Users\\sarthak\\Desktop\\file.txt";
		try {
			FileOutputStream fout = new FileOutputStream(filePath);
			fout.write(data.getBytes());

			System.out.println("data stored into the file Successfully!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
