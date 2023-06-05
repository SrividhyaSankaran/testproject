package testproject.assessment;

import java.io.*;
import java.lang.*;

public class Exceptions {
	
	
	static void taxApplicable(int ctc) throws CustomException{    
	    
		if(ctc < 700000){  
	        throw new CustomException("Not Eligible for New Tax Regime");    
	    }else {   
	        System.out.println("Eligible for New Tax Regime");   
	    }   
	}
	
	public static void main(String args[]) {
				
		
		//Arithmetic Exception
		try{  
			int a = 15;
			double data= a/0;  
			System.out.println("Data : "+ data);
			
		}catch(ArithmeticException ex) {
			
			System.out.println("Arithmetic Exception : "+ ex);
		}
		
		
//		try {
//			
//			Integer
//			
//		}catch(NumberFormatException ex) {
//			System.out.println("Number Format Exception "+ ex);
//		}
		//NullPointer Exception
			String s1 = null;
			try{  
				
				if(s1.equalsIgnoreCase("java")) 
					System.out.println("String Matched : "+ s1);
				else
					System.out.println("String Not Matched : "+ s1);
				
			}catch(NullPointerException ex) {
				
				System.out.println("NullPointer Exception : "+ ex);
			}
			
		// ArrayIndexOtofBound
		String str[] = {"java", "spring", "hibernate"};
		try {
			System.out.println(str[3]);

		}catch(ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("Array Index Out Of Bound Exception : "+ ex.getMessage());
		} finally{
			System.out.println("Array length : "+ str.length);
		}
		
		// OwnException
		try {
			
			taxApplicable(467000);
		}catch(CustomException ex) {
			
			System.out.println("My Own Custom Exception : "+ ex);
		}
		
		
		
		
		
//		File file = new File("testfile.txt");
//	    try {
//	        FileInputStream stream = new FileInputStream(file);
//	    } catch (FileNotFoundException ex) {
//	    	System.out.println("File Not Found");
//	        ex.printStackTrace();
//	    }
//	    
//	    try {
//			
//	    	TestException exp = new TestException();
//	    	exp.m1();
//			
//		}catch(IOException ex) {
//			System.out.println("IO Exception");
//			System.out.println(ex.getMessage());
//			ex.printStackTrace();
//		}
	    
		
	}
}