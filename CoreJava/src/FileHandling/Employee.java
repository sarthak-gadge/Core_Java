package FileHandling;

import java.io.Serializable;

public class Employee implements Serializable{
	
// using transient keyword empId not Stored in output.
//	private transient int empId;
	
	private int empId;
	private String empName;
	private double empSalary;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
