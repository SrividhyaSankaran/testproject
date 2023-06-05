package testproject.Java8Features;
import java.util.*;
import java.util.stream.Collectors;

import testproject.SerializeDeserialize.Employee;

public class MapFlatMap {

	public static void main(String[] arg) {
		
		Employee emp1 = new Employee(1,"Veera");
		Employee emp2 = new Employee(2,"Yashwanti");
		Employee emp3 = new Employee(3,"Anu");
		Employee emp4 = new Employee(4,"Usha");
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		List<String> names = emps.stream().map(x->x.empName).collect(Collectors.toList());
		System.out.println("Names List using map : "+names);
		
		List<List<Integer>> ids = new ArrayList<>();
		ids.add(Arrays.asList(1,2,4));
		ids.add(Arrays.asList(23,2,7,89));
		ids.add(Arrays.asList(14,89,28,9));
		ids.add(Arrays.asList(5,7,2,99));
		
		List<Integer> num = ids.stream().flatMap(m->m.stream().distinct()).collect(Collectors.toList());
		
		System.out.println("List of Integers using Flatmap : "+num);
	}
}
