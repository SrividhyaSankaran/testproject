package testproject.HashMapHashTable;

public class Thread3 extends Thread {
    
	HashTable ht;
	
	public Thread3(HashTable ht) {

		this.ht=ht;

	}
	public void run() {
       
		System.out.println("Thread 3 Accessing browser HashMap - Thread safe ");
    	ht.getHashTableData("Thread 3");  
	}

}