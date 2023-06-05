package testproject.assessment;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "srividhya";
		String s2 = "srividhya";
		String s3 = "Srividhya";

		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		if(s1 == s3) {
			System.out.println("s1 and s3 = matched");
		}
		if(s1.equals(s3)) {
			System.out.println("s1 and s3 equal");
		}
	}
}
