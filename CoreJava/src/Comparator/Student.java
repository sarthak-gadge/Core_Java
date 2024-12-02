package Comparator;

public class Student {

	private int studId;
	private String studName;
	private double studMark;

	public Student(int studId, String studName, double studMark) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMark = studMark;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getStudMark() {
		return studMark;
	}

	public void setStudMark(double studMark) {
		this.studMark = studMark;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMark=" + studMark + "]";
	}

}
