package constructorHomework;

public class Developer extends Employee {
	
	private int nightAllowance;

	public Developer(int empId,String empName,int basicSal,int hra,int da,int nightallowance) {
		super(empId,empName,basicSal,hra,da);
		this.nightAllowance = nightAllowance;
	}
	
	@Override
	public double CalculateSalary() {
		
		return super.CalculateSalary() + nightAllowance;
	}
	
	public double getnightAllowance() {
		return nightAllowance;
	}
	
	
	

}
