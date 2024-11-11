package introduction_to_java;

public class Student {
	
	private int studId;
	private String studName;
	private double studMark;
	
	public void setstudId(int studId) {
		this.studId = studId;
	}
	public int getstudId() {
		return studId;
	}
	
	
	public void setstudName(String studName) {
		this.studName = studName;
	}
	public String getstudName() {
		return studName;
	}
	
	
	public void setstudMark(double studMark) {
		this.studMark = studMark;
	}
	public double getstudMark() {
		return studMark;
	}

}
