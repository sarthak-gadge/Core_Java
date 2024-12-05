package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\sarthak\\Desktop\\file2.txt";
		
		try {
			FileInputStream in = new FileInputStream(filePath);
			ObjectInputStream obin = new ObjectInputStream(in);
			
			Student stud= (Student) obin.readObject();
			System.out.println(stud);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
