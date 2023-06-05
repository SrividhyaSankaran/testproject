package testproject.SerializeDeserialize;
import java.io.*;
import java.util.*;
import java.util.logging.Logger;


public class SerializableCode {

	public static void main(String[] arg) {
		// Logger Configuration
		Logger log = Logger.getLogger(SerializableCode.class.getName());
		log.info("Started Serializtion Process");
		
		Employee emp = new Employee(1,"Srividhya");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Srividhya");
		arr.add("Divya");
		arr.add("Radhika");
		arr.add("Maha");
		arr.add("Nithishkumar");
		arr.add("Amaresh");
		arr.add("Dineshkumar");
		 
		//logger usage
		log.info("check array data : "+arr);
		log.warning("Kindly do serialization before deserialization");
		
		//Serialization
		try {
			
			FileOutputStream file = new FileOutputStream("testSerialization");
			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(emp);
			obj.close();
			file.close();
			
			FileOutputStream file1 = new FileOutputStream("testSerialization1");
			ObjectOutputStream obj1 = new ObjectOutputStream(file1);
			obj1.writeObject(arr);
			obj1.close();
			file1.close();
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		//Deserialization
		try {
			FileInputStream file = new FileInputStream("testSerialization");
			ObjectInputStream obj = new ObjectInputStream(file);
			Employee empObj = (Employee)obj.readObject();
			System.out.println(empObj);
			
			FileInputStream file1 = new FileInputStream("testSerialization1");
			ObjectInputStream obj1 = new ObjectInputStream(file1);
			ArrayList list = (ArrayList)obj1.readObject();
			System.out.println(list);
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		
	}
}
