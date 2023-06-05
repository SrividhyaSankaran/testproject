package testproject.HashMapHashTable;

public class Thread1 extends Thread {
    
	Hashmap hm;
	
	public Thread1(Hashmap hm) {
		this.hm=hm;
	}
	
	public void run() {
            
    	System.out.println("Thread 1 Accessing browser HashMap - Not Thread safe ");
    	hm.getHashMapData("Thread 1");            
	}

}
