package testproject.Java8Features;

interface Sal{
	void getSal();
}
public abstract class MethodRef implements Sal {
	
	public static void cal() {
		System.out.println("jdhfjhdj");
	}

	public static void main(String[] arg) {
		
		Sal s = MethodRef::cal;
		s.getSal();
	}
}
