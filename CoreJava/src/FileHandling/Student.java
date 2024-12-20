package FileHandling;

import java.io.Serializable;

public class Student implements Serializable {

	private int studId;
	private  String studName;
	private double studMarks;

	public Student() {
		super();
	}

	public Student(int studId, String studName, double studMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMarks = studMarks;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMarks=" + studMarks + "]";
	}

}
