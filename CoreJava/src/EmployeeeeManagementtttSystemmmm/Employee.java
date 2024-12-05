package EmployeeeeManagementtttSystemmmm;

public class Employee {
	private int empId;
	private String empName;
	private double empBasicSal;
	private double empHRA;
	private double empPF;
	
	public Employee() {
		super();
	}


	public Employee(int empId, String empName, double empBasicSal, double empHRA, double empPF) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empBasicSal = empBasicSal;
		this.empHRA = empHRA;
		this.empPF = empPF;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpBasicSal() {
		return empBasicSal;
	}


	public void setEmpBasicSal(double empBasicSal) {
		this.empBasicSal = empBasicSal;
	}


	public double getEmpHRA() {
		return empHRA;
	}


	public void setEmpHRA(double empHRA) {
		this.empHRA = empHRA;
	}


	public double getEmpPF() {
		return empPF;
	}


	public void setEmpPF(double empPF) {
		this.empPF = empPF;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empBasicSal=" + empBasicSal + ", empHRA="
				+ empHRA + ", empPF=" + empPF + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
