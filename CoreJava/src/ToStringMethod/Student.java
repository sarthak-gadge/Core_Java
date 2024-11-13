package ToStringMethod;

public class Student {

	private static int studId=900;
	private String studName;
	private double studAge;

	
	public Student() {
		super();
	}


	public Student(String studName, double studAge) {
		super();
		studId+=100*2;
		this.studName = studName;
		this.studAge = studAge;
	}


	@Override
	public String toString() {
		return "Student studId=" + studId + "\nstudName=" + studName + "\nstudAge=" + studAge + "";
	}

}
