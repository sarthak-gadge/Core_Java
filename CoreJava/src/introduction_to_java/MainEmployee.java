package introduction_to_java;

public class MainEmployee {
	
	public static void main (String[] args) {
		Employee e1 = new Employee();
		
		e1.setempId(12);
		e1.setempName("sanket");
		e1.setempSalary(50000);
		e1.setempJob("HR");
		
		
		int id = e1.getempId();
		String name = e1.getempName();
		int salary = e1.getempSalary();
		String job = e1.getempJob();
		
		
		System.out.println("empolyee id: "+id);
		System.out.println("employee name: "+name);
		System.out.println("employee salary: "+salary);
		System.out.println("employee job: "+job);
		
	
	}

}
