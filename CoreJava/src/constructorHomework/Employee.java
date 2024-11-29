package constructorHomework;

public class Employee {
	
	private int empId;
	private String empName;
	private double basicSal;
	private double hra;
	private double da;
	
	public Employee(int empId,String empName,int basicSal, int hra, int da) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}
	
	public double CalculateSalary() {
		return basicSal+hra+da;
		
		
	}
	
	
    }

