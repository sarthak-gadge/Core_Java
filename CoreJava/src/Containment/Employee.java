package Containment;

import ToStringMethod.MyDate;

public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	private MyDate joiningDate;

	public Employee() {
		empId = 123;
		empName = "Sarthak";
		empSalary = 50000;
		joiningDate = new MyDate();
	}

	public Employee(int empId, String empName, double empSalary, MyDate joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.joiningDate = new MyDate();	}

	@Override
	public String toString() {
		return "Employee empId=" + empId + "\n empName=" + empName + "\n empSalary=" + empSalary + "\n joiningDate="
				+ joiningDate + "";
	}
	
	
	

}
