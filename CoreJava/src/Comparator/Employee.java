package Comparator;


public class Employee {
	private int empid;
	private String empName;
	private double empsalary;

	public Employee(int empid, String empName, double empsalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsalary = empsalary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	
	

}
