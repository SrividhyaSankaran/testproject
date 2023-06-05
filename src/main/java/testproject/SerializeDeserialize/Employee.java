package testproject.SerializeDeserialize;

import java.io.Serializable;

public class Employee implements Serializable {

	public int empId;
	public String empName;
	public String email;
	public int age;
	public String department;
	public double salary;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Employee(int empId, String empName, String email, int age, String department, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	
	
	
}
