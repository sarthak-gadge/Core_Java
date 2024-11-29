package Polymorphism;

public class Manager extends Employee {
	
	private int incentive;
	
	
	public Manager(int basicSal, int hra, int da, int incentive) {
		super(basicSal, hra, da);
		this.incentive = incentive;
	}

	@Override
	public int calculateSalary() {
		
		return super.calculateSalary() + incentive;
	}
	
	
	public int getincentive() {
		return incentive; 
	}
	
}
