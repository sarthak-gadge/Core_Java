package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializableeeee {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\sarthak\\Desktop\\file.txt";
		try {
			FileOutputStream fout = new FileOutputStream(filePath);
			
			ObjectOutputStream obout = new ObjectOutputStream(fout);
			Employee emp = new Employee(124,"Ravi",85000);
			obout.writeObject(emp);
			System.out.println("Object Stored into the file Successfully!!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
