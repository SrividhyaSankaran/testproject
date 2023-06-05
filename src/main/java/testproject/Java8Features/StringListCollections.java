package testproject.Java8Features;

import java.util.*;


public class StringListCollections {

	public static void concat(String str1,String str2) {
		String str = str1+str2;  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String
        String str="Sri"; 
        
        concat(str,"vidhya");
        System.out.println("String Concat : "+str);
        
        StringBuilder s2 = new StringBuilder("Sri");
        s2.append("vidhya");
        System.out.println("String Builder: " + s2);
      
        StringBuffer s3 = new StringBuffer("Sri");
        s3.append("vidhya");
        System.out.println("String Buffer: " + s2);
        
        
        //Collections
        ArrayList<String> arr = new ArrayList<String>();
		arr.add("Srividhya");
		arr.add("Divya");
		arr.add("Radhika");
		System.out.println("ArrayList");
		arr.forEach(x->{
			System.out.println(x);
		});
        
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(5);
		arr1.add(8);
		arr1.add(34);
		arr1.add(10);
		System.out.println("List : ");
		Iterator<Integer> itr = arr1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList<String> arr2 = new LinkedList<String>();
		arr2.add("Keyboaard");
		arr2.add("Mouse");
		arr2.add("Monitor");
		System.out.println("LinkedList : "+arr2);
        
		Set<String> set = new HashSet<String>();
		set.addAll(arr);
		System.out.println("Set : "+set);
	}

}
