package constructorHomework;

public class MainEmpManDevTest {
	
	public static void main(String[] args) {
		
		Manager m1 = new Manager(12,"Sarthak",4562,2514,7895,7000);
		double mansal = m1.CalculateSalary();
		System.out.println("manager salary is: "+mansal);
		
		
		
		Developer d1 = new Developer(13,"ravi",25000,1526,8965,2000);
		double devsal = d1.CalculateSalary();
		System.out.println("Developer salary is: "+devsal);
		
		System.out.println("=================================================");
		
		
		Tester t1 = new Tester(14 , "Sanket", 25000, 5642, 1254, 4000);
		double testsal = t1.CalculateSalary();
		System.out.println("Tester Salary is: "+testsal);
		
		
	}

}
