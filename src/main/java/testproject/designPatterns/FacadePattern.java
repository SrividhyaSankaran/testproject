package testproject.designPatterns;
import java.util.*;

import testproject.assessment.Showroom;
public class FacadePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Selection number to get the details about the car : ");
		int select = 0;
		Scanner io = new Scanner(System.in);
		select = io.nextInt();
		Showroom sr = new Showroom();
		switch(select) {
			case 1:
				sr.bmwSale();
				break;
			case 2: 
				sr.benzSale();
				break;
			default:
				System.out.println("Selection not matched with the available cars");
				return;
		}
		
		
	}

}
