package testproject.designPatterns;

import java.util.List;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp emps = new Emp();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Emp empsNew = (Emp) emps.clone();
		Emp empsNew1 = (Emp) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Naga");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}
