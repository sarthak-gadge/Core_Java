package EmployeeeeManagementtttSystemmmm;

public class Developer extends Employee{
	
	private double overTime;

	public Developer(int empId, String empName, double empBasicSal, double empHRA, double empPF, double overTime) {
		super(empId, empName, empBasicSal, empHRA, empPF);
		this.overTime = overTime;
	}

	public Developer() {
		super();
	}

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}

	@Override
	public String toString() {
		return "Developer [overTime=" + overTime + ", getOverTime()=" + getOverTime() + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + ", getEmpBasicSal()=" + getEmpBasicSal() + ", getEmpHRA()="
				+ getEmpHRA() + ", getEmpPF()=" + getEmpPF() + "]";
	}
	
	
	
	
	
	
	

}
