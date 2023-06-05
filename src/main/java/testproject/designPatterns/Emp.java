package testproject.designPatterns;

import java.util.ArrayList;
import java.util.List;

public class Emp implements Cloneable{

	private List<String> empList;
	
	public Emp(){
		empList = new ArrayList<String>();
	}
	
	public Emp(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Naga");
		empList.add("Sri");
		empList.add("Dhoni");
		empList.add("Virat");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Emp(temp);
	}
	
}