package Inheritance;

public class MainEmpMan {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.calculateSalary();
		
		
		Manager mgr = new Manager();
		int inc = mgr.getIncentive();
		int sal = mgr.calculateSalary();

		System.out.println("Salary of Manager: " + (inc + sal));

	}
}
