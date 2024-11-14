package Inheritance;

public class Employee {
	
	private int basicSalary;
	private int hra;
	private int da;
	
	
	public Employee() {
		basicSalary = 12500;
		hra = 3456;
		da = 354;
	}
	
	public int calculateSalary() {
		return basicSalary+hra+da;
	}
}
