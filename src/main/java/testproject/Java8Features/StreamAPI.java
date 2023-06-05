package testproject.Java8Features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import testproject.SerializeDeserialize.Employee;

public class StreamAPI {

	public static void main(String[] args) {
		
		String s = "JaVa";
		char[] ch = s.toCharArray();
		
		
		HashMap<String,Integer> fairs = new HashMap<String,Integer>();
		fairs.put("HYD-BLR", 1500);
		fairs.put("CHN-BLR", 1800);
		fairs.put("HYD-CBE", 2100);
		fairs.put("BLR-CBE", 1200);
		
		System.out.println("Enter the Trip Source - Destination Code (Ex: HYD-BLR) : ");
		Scanner io =  new Scanner(System.in);
		String trip = io.nextLine();
		System.out.println("Enter the COUPON Code if available : ");
		Scanner op =  new Scanner(System.in);
		String coupon = op.nextLine();
		//int tot = 0;
		 
		fairs.forEach((k,v)->{
			if(k.equals(trip)) {
			int	tot = v;
				if(coupon.equals("WELCOME")) {
					int dis = (tot*5)/100;
					System.out.println("Discount Amount (for WELCOME 5%) : "+dis);
					tot = tot - dis;
					System.out.println("Payable Amount : "+tot);
					
					return;
				}
			}
		});
		
		
		
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Swetha", "swetha@gmail.com", 28, "Development", 45000);
		Employee e2 = new Employee(1,"Sandhiya", "sandhiya@yahoo.com", 25, "HR", 40000);
		Employee e3 = new Employee(1,"Sakthi", "sakthi@gmail.com", 25, "QA", 35000);
		Employee e4 = new Employee(1,"Siva", "siva@outlook.com", 27, "Development" , 50000);
		Employee e5 = new Employee(1,"Prakash", "prakash@gmail.com", 23, "QA", 42000);
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		List<Employee> ageFilteredEmps = emps.stream().filter(x->x.age >=25).collect(Collectors.toList());
		for(Employee e : ageFilteredEmps){
			System.out.println(e.empName + " - "+ e.email+ " - "+ e.age + " - "+e.department);
		}
		
		System.out.println("Departments :");
		List<String> departmentEmps = emps.stream().map(x->x.department.toUpperCase()).collect(Collectors.toList());
		Iterator<String> it = departmentEmps.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<String> ep = departmentEmps.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Department Sorted Dec : "+ep);
		
		
		 Map<String, Long> depWiseEmp = emps.stream().collect(Collectors.groupingBy(x->x.department, TreeMap::new, Collectors.counting()));
		 depWiseEmp.forEach((dept,count)->{
			 System.out.println("Department : "+dept+" - No of Emps: "+count);
		 });
		 
		 
		
	}
}
