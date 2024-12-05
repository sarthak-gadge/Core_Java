package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializableee {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\sarthak\\Desktop\\file2.txt";

		try {
			FileOutputStream fout = new FileOutputStream(filePath);
			ObjectOutputStream obout = new ObjectOutputStream(fout);
			
			Student stud = new Student(12, "Sanket", 90.66);
			obout.writeObject(stud);
			
			System.out.println("object stored into file Successfully!!!!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
