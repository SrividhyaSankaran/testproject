package testproject.HashMapHashTable;
import java.util.*;

public class HashTable {
	
	public static Hashtable<Integer,String> items = new Hashtable<Integer, String>();
	
	void getHashTableData(String thread) {
		for (int i = 1; i <= 5; i++) {
        	System.out.println(thread+" Items -"+items.get(i));
        	try {
				Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
        }
	}

	public static void main (String[] arg) {
			
		items.put(1, "bag");
		items.put(2, "laptop");
		items.put(3, "Mobile");
		items.put(4, "Charger");
		System.out.println("HashTable");
		for(Map.Entry dt : items.entrySet()) {
			System.out.println(dt.getKey()+" - "+dt.getValue());
		}
		
		HashTable ht = new HashTable();
		Thread3 t3 = new Thread3(ht);
		Thread4 t4 = new Thread4(ht);
		t3.start();
		t4.start();
	}
	
	
}
