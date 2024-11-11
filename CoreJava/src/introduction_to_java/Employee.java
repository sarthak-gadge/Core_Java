package introduction_to_java;

public class Employee {
	
	private int empId;
	private String empName;
	private int empSalary;
	private String empJob;
	
	public void setempId(int empId) {
		this.empId = empId;
	}
	public int getempId() {
		return empId;
	}
	
	
	public void setempName(String empName) {
		this.empName = empName;
	}
	public String getempName() {
		return empName;
	}
	
	
	public void setempSalary(int empsalary) {
		this.empSalary = empsalary;
	}
	public int getempSalary() {
		return empSalary;
	}
	
	
	public void setempJob(String empJob) {
		this.empJob = empJob;
	}
	public String getempJob() {
		return empJob;
	}
	
}
