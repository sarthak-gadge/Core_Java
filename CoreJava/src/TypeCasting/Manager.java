package TypeCasting;

public class Manager extends Employee {
	
	private int incentive;

	public Manager(int basicSal,int hra,int da,int incentive) {
		super(basicSal,hra,da);
		this.incentive = incentive;
	}
	
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary() + incentive;
	}
	
	public int getIncentive() {
		return incentive;
	}

	
	
	

}