package EmployeeeeManagementtttSystemmmm;

public class Manager extends Employee {

	private double incentive;

	public Manager(int empId, String empName, double empBasicSal, double empHRA, double empPF, double incentive) {
		super(empId, empName, empBasicSal, empHRA, empPF);
		this.incentive = incentive;
	}

	public Manager() {
		super();
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + ", getIncentive()=" + getIncentive() + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + ", getEmpBasicSal()=" + getEmpBasicSal() + ", getEmpHRA()="
				+ getEmpHRA() + ", getEmpPF()=" + getEmpPF() + "]";
	}
	
	

}
