package testproject.assessment;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Palindrome
		String txt, rev = "";
		Scanner io =  new Scanner(System.in);
		System.out.println("Enter string to check if it is a palindrome");
		txt = io.nextLine();
		for(int i=txt.length()-1; i>=0; i--) {
			rev += txt.charAt(i);
		}
		if(txt.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
		
		String str = "Assessment";
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<=str.length();i++) {
			hs.add(str.charAt(i));
		}
				
		System.out.println(hs.size());
	}

}
