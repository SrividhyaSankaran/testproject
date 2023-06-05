package testproject.designPatterns;

import testproject.designPatterns.Singleton.SingletonPattern;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer("pc","3500","1000");
		Computer laptop = ComputerFactory.getComputer("Laptop","5200","1400");
		System.out.println("Factory PC Prices : "+pc);
		System.out.println("Factory Laptop Prices : "+laptop);
		
			
		SingletonPattern sp = SingletonPattern.getInstance();
		sp.setName("sri");
		System.out.println(sp.getName());
	}

}
