package Basic;

public class Student {
	int studId;
	String studName;
	int studMarks;
	
	void detail() {
		studId = 105;
		studName = "sarthak";
		studMarks = 90;
	}
	
	void print() {
		System.out.println("student id: "+studId);
		System.out.println("student name: "+studName);
		System.out.println("student mark: "+studMarks);
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.detail();
		s1.print();
		
	}

}
