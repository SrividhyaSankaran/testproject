package testproject.assessment;

public class Test {
	
	public static void concat(String str1,String str2) {
		String str = str1+str2;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Spring"; 
        
        concat(str,"Boot");
        System.out.println("String Concat : "+str);
        
        
		String s1 = "jav";
		String s2 = "java";
		
		int i = s1.compareTo(s2);
		System.out.println(i);
		
		if(s1 == s2)
			System.out.println("Matching " + s1);
		
		if(s1.equals(s2))
			System.out.println("Equals match: " + s1);
		
		if(s1.compareTo(s2) == 0)
			System.out.println("compare string " + s1);
		else
			System.out.println("Not matched (compareTo) " + s1.compareTo(s2) );
	}

}
