package TypeCasting;

public class Employee {
	
	private int basicSal;
	private int hra;
	private int da;
	
	
	public Employee(int basicSal, int hra, int da) {
		super();
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}
	
	

	public int calculateSalary() {
		return basicSal+hra+da;
	}
	
	

}
