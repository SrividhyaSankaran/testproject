package testproject.designPatterns.Singleton;


public class SingletonPattern {

	private static String name = "sri";
	private static SingletonPattern obj;
	
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getInstance() {    
        if (obj==null) {
        	obj = new SingletonPattern();
        }
        return obj;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		SingletonPattern.name = name;
	}

     
}

