package Polymorphism;

public class Developer extends Employee1{
	
	private int nightAllowance;

	public Developer(int basicSal, int hrs, int da, int nightAllowance) {
		super(basicSal, hrs, da);
		this.nightAllowance = nightAllowance;
	}
	
	@Override
	public int calculateSalary() {
		return super.calculateSalary() + nightAllowance;
	}
	
	public int getnightAllowance() {
		return nightAllowance;
	}
	

}
