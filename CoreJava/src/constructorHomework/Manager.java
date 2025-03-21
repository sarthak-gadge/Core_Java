package constructorHomework;

public class Manager extends Employee {
	
	private int incentive;

	public Manager(int empId,String empName,int basicSal, int hra, int da, int incentive) {
		super(empId,empName,basicSal,hra,da);
		this.incentive = incentive;
	}
	
	@Override
	public double CalculateSalary() {
		return super.CalculateSalary() + incentive;
	}
	
	public double getIncentive() {
		return incentive;
		
	}
	
	
	
	

}
