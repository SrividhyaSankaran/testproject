package testproject.HashMapHashTable;

public class Thread4 extends Thread {
    
	HashTable ht;
	
	public Thread4(HashTable ht) {

		this.ht=ht;

	}
	public void run() {
       
		System.out.println("Thread 4 Accessing browser HashMap - Thread safe ");
    	ht.getHashTableData("Thread 4");  
	}

}