package testproject.assessment;

import java.util.HashMap;
import java.util.*;

public class InternalHashMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");

		Set<String> keySet = map.keySet();

		map.put("4", "4");
		map.put("5", "5");
		keySet.remove("1");

		System.out.println("Key Set : "+keySet);
		
		System.out.println("*************************");
		int length = map.size();
		for(Map.Entry dt : map.entrySet()) {
			int hash = dt.getKey().hashCode();
			int index = hash * (length-1);
			System.out.println("Hashcode of Key ["+dt.getKey()+"]: "+hash);
			System.out.println("Index : "+index);
		}
	}
}
