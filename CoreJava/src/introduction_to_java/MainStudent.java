package introduction_to_java;

public class MainStudent {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setstudId(1);
		s1.setstudName("Sanket");
		s1.setstudMark(90.80);
		
		
		int id = s1.getstudId();
		String name = s1.getstudName();
		double mark = s1.getstudMark();
		
		System.out.println("student Detail");
		System.out.println("student ID: "+id);
		System.out.println("student name: "+name);
		System.out.println("student marks: "+mark);
		
		
		
	}

}
