package EmployeeeeManagementtttSystemmmm;

public class Tester extends Employee {

	private double nightAllowance;

	public Tester(int empId, String empName, double empBasicSal, double empHRA, double empPF, double nightAllowance) {
		super(empId, empName, empBasicSal, empHRA, empPF);
		this.nightAllowance = nightAllowance;
	}

	public Tester() {
		super();
	}

	public double getNightAllowance() {
		return nightAllowance;
	}

	public void setNightAllowance(double nightAllowance) {
		this.nightAllowance = nightAllowance;
	}

	@Override
	public String toString() {
		return "Tester [nightAllowance=" + nightAllowance + ", getNightAllowance()=" + getNightAllowance()
				+ ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpBasicSal()="
				+ getEmpBasicSal() + ", getEmpHRA()=" + getEmpHRA() + ", getEmpPF()=" + getEmpPF() + "]";
	}

}
