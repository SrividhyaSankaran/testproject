package testproject.designPatterns;

public class Marketing implements Connection {

	@Override  
    public void open() {  
       System.out.println("open database for marketing");  
    }  
    @Override  
    public void close() {  
       System.out.println("close the marketing database");  
    }  
      
    @Override  
    public void update() {  
        System.out.println("Marketing has been updated");  
    }  
}
