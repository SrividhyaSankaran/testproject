package testproject.designPatterns;

public class Controller {

    public static Sales sales;  
    public static Marketing marketing;  
    
    private static Connection con;  
    
    Controller(){
    	sales = new Sales();
    	marketing = new Marketing();
    }
    
    public void setSalesConnection() {  
        con  = sales;  
    }  
    public void setMarketingConnection() {  
        con  = marketing;  
    }  
    
    public void open() {  
        con .open();  
    }  
    public void close() {  
        con .close();  
    }   
    public void update() {  
        con .update();  
    }  
}
