package testproject.Java8Features;
import java.util.*;
import java.util.stream.Collectors;
//Features of Java 8
@FunctionalInterface
interface Func {
	//only one abstract method alowed in functional interface
	abstract void get(String data);
	
	//default method
	default void getDetails() {
		System.out.println("Cuurently office located in Banglore, Karnataka");
	}
}


interface Arithmetic{  
    void calc();  
}  

public class NewFeaturesJava8 implements Func {

	@Override
	public void get(String data) {
		// TODO Auto-generated method stub
		System.out.println(data);
	}
	
	public static void add() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,4,5,7,4,12,43,7,67,67,34);
		//Lamda Expression
		arr.forEach((n)->{
			System.out.println(n);
		});
		
		//Stream API
		Map<Integer,Long> num = arr.stream().collect(Collectors.groupingBy(s->s,TreeMap::new,Collectors.counting()));
		
		for(Map.Entry nm : num.entrySet()) {
			
			System.out.println(nm.getKey()+"  : Occurance :"+nm.getValue());
			
		}
		NewFeaturesJava8 js = new NewFeaturesJava8();
		js.get("Functional Interface running .. ");
		
		Arithmetic ar = NewFeaturesJava8::add;
		ar.calc();
		
		
	}
	
}
