package testproject.designPatterns;

public class ComputerFactory {

	public static Computer getComputer(String type, String keyboard, String mouse){
		if("PC".equalsIgnoreCase(type)) return new PC(keyboard, mouse);
		else if("Laptop".equalsIgnoreCase(type)) return new Laptop(keyboard, mouse);
		
		return null;
	}
}