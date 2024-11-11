package StaticVariable;

public class Student2 {
	private int studId;
	private String studName;
	private double studMark;
	private static int autoID;
	
	
	static {
		autoID = 100;
	}
	
	
	public Student2() {
		autoID ++;
		studId = autoID;
	}
	
	
	public Student2(int id,String name,double mark) {
		autoID ++;
		studId = autoID;
		
		studName = name;
		studMark = mark;
	}
	
	
	void Print() {
		System.out.println("==================================");
		System.out.println("Student Id :"+studId);
		System.out.println("Student Name :"+studName);
		System.out.println("Student Marks :"+studMark);
		System.out.println("==================================");
	}


}
