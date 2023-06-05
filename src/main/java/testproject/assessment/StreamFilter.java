package testproject.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import testproject.SerializeDeserialize.Employee;

public class StreamFilter {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Swetha", "swetha@gmail.com", 28, "Development", 45000);
		Employee e2 = new Employee(1,"Sandhiya", "sandhiya@yahoo.com", 25, "HR", 40000);
		Employee e3 = new Employee(1,"Sakthi", "sakthi@gmail.com", 23, "QA", 35000);
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		
		
		List<Employee> filteredEmps = emps.stream().filter(x->x.age >=25).collect(Collectors.toList());
		for(Employee e : filteredEmps){
			System.out.println(e.empName + " - "+ e.email+ " - "+ e.age + " - "+e.department);
		}
	}
	
}
