package Inheritance;

public class Manager1 extends Employee1{
	
		private int incentive;

		
	//using Parametarized Constructor
		public Manager1(int basicSalary, int hra, int da, int incentive) {
			super(basicSalary, hra, da);
			this.incentive = incentive;
		}
		
		public int getIncentive() {
			return incentive;
		}


	}
		

