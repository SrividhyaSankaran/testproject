package testproject.assessment;

public class ArithmeticExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{  
				int a = 25;
				double data= a/0;  
				System.out.println("Data : "+ data);
				
			}catch(ArithmeticException ex) {
				
				System.out.println("Arithmetic Exception : "+ ex);
			}
				
	}

}
