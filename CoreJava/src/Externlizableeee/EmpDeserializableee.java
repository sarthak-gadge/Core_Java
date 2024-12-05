package Externlizableeee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpDeserializableee {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\sarthak\\Desktop\\file.txt";
		
		try {
			FileInputStream in = new FileInputStream(filePath);
			ObjectInputStream obin = new ObjectInputStream(in);
			Employee emp =(Employee) obin.readObject();
			System.out.println(emp);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
