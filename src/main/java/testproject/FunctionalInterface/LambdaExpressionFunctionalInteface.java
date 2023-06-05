package testproject.FunctionalInterface;

@FunctionalInterface
interface Salary {
	
	double calculatetax(double salary, double taxpercent);

}

public class LambdaExpressionFunctionalInteface {
	
	public static void main (String[] arg) {
	
		Salary s = (num1, num2) -> { 
			double n = (num1 * num2)/100;
			return n;
		};
		System.out.println(s.calculatetax(20000, 2.5));
	}

}
