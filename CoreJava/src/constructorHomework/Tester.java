package constructorHomework;

public class Tester extends Employee {
	
	private int overTime;

	public Tester(int empId,String empName,int basicSal, int hra, int da, int overTime) {
		super(empId,empName,basicSal,hra,da);
		this.overTime = overTime;
	}
	
	@Override
	public double CalculateSalary() {
		
		return super.CalculateSalary() + overTime;
	}
	
	public double getoverTime() {
		return overTime;
	}
	
	

}
