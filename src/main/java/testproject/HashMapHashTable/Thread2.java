package testproject.HashMapHashTable;

public class Thread2 extends Thread {
      
	Hashmap hm;
	
	public Thread2(Hashmap hm) {

		this.hm=hm;

	}
	public void run() {
       
		System.out.println("Thread 2 Accessing browser HashMap - Not Thread safe ");
    	hm.getHashMapData("Thread 2");  
	}

}
