package StaticVariable;

public class Student {
	
	private int studId;
	private String studName;
	private double studMark;
	private static int count;
	
	public static int getcount() {
		return count;
	}
	
	
	public Student() {
		count++;
	}
	
	
	public Student(int id,String name,double mark) {
		count++;
		studId = id;
		studName = name;
		studMark = mark;
	}
	
	
	public void Print() {
		System.out.println("=============================================================================");
		System.out.println("student id: "+studId);
		System.out.println("student name: "+studName);
		System.out.println("student mark: "+studMark);
		System.out.println("==============================================================================");
	}

}
