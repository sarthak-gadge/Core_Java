package StaticVariable;

public class MainStudent {
	
	public static void main(String[] args) {
		
		System.out.println("total count before:"+Student.getcount());
		Student s1 = new Student(11,"ravi",44.90);
		Student s2 = new Student(12,"sarthak",55.90);
		Student s3 = new Student(13,"sanket",66.90);
		Student s4 = new Student(14,"sameer",77.90);
		
		
		s1.Print();
		s2.Print();
		s3.Print();
		s4.Print();
		
		System.out.println("total count after:"+Student.getcount());
		
		
		
	}

}
