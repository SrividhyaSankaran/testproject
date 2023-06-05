package testproject.Others;

abstract class College {
	abstract void fees();
	static void getmessage() {
		System.out.println("This fees is for the current Financial Year");
	}
}

interface Department {
	abstract void getDepartment();
	default void getNewUpdate() {
		System.out.println("Semester Exam starts from on 2nd May 2023");
	}
	
}

class AnnaUniversity extends College {

	@Override
	void fees() {
		System.out.println("This term Fees of B.E in Anna University is 35000");
	}
	
}

class IIT extends College {

	@Override
	void fees() {
		System.out.println("This term Fees of B.E in IIT is 125000");
	}
	
}

class BharathiarUniversity extends College implements Department {

	@Override
	public void getDepartment() {
		System.out.println("It has ECE, EEE, CSE, Mech, Civil, IT Departments");
		
	}

	@Override
	void fees() {
		// TODO Auto-generated method stub
		System.out.println("This term Fees of B.E in Bharathiar University is 35000");
	}
	
}

public class Abstraction {

	public static void main (String arg[]) {
		College obj1 = new AnnaUniversity();
		obj1.getmessage();
		obj1.fees();
		
		BharathiarUniversity obj2 = new BharathiarUniversity();
		obj2.getDepartment();
		obj2.fees();
	}
			
}
