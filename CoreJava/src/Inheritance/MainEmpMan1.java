package Inheritance;

public class MainEmpMan1 {
	
	public static void main(String[] args) {


		
// using parametarized constructor
		Manager1 mgr = new Manager1(45200,5500,456,8000);
		
		int sal = mgr.getIncentive();

		System.out.println("Salary of Manager: " + sal);

	}

}
