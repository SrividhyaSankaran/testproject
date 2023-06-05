package testproject.HashMapHashTable;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static HashMap<Integer,String> browsers = new HashMap<Integer, String>();
	
	synchronized void getHashMapData(String thread) {
		for (int i = 1; i <= 5; i++) {
        	System.out.println(thread+" Items -"+browsers.get(i));
        	try {
				Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
        }
	}
	
	public static void main (String[] arg) {
		
		browsers.put(1,"Chrome");
		browsers.put(2, "Mozilla");
		browsers.put(3, "Opera");
		browsers.put(4, "Microsoft Edge");
		
		System.out.println("HashMap");
		browsers.replace(2, "Mozilla", "New Browser");
		for(Map.Entry dt : browsers.entrySet()) {
			
			System.out.println(dt.getKey()+" - "+dt.getValue());
		}
		
		Hashmap hm = new Hashmap();
		Thread1 t1 = new Thread1(hm);
		Thread2 t2 = new Thread2(hm);

		t1.start();
		t2.start();
		
	}
	
}
