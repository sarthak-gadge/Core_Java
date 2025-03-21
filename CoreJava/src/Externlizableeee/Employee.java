package Externlizableeee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(empId);
		out.writeDouble(empSalary);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		empId = in.read();
		empSalary = in.readDouble();
		
	}
	
	
	
	

}
