package Inheritance;

public class Employee1 {
	private int basicSalary;
	private int hra;
	private int da;
	
	
	
	//using Parametarized Constructor
	public Employee1(int basicSalary, int hra, int da) {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
	}




	public int calculateSalary() {
		return basicSalary+hra+da;
	}

}
