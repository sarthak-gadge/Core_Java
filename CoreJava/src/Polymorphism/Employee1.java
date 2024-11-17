package Polymorphism;

public class Employee1 {
	private int basicSal;
	private int hrs;
	private int da;
	
	
	public Employee1(int basicSal, int hrs, int da) {
		super();
		this.basicSal = basicSal;
		this.hrs = hrs;
		this.da = da;
	}
	
	public int calculateSalary() {
		return basicSal+hrs+da;
	}
	
	

}
