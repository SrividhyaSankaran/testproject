package testproject.designPatterns;

interface Connection {  
	  
    public void open();  
    public void close();  
    public void update();  
}
public class Sales implements Connection {

	@Override  
    public void open() {  
       System.out.println("open database for sales");  
    }  
    @Override  
    public void close() {  
       System.out.println("close the sales database");  
    }  
      
    @Override  
    public void update() {  
        System.out.println("Sales has been updated");  
    }  
}
