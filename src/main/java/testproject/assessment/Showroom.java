package testproject.assessment;

interface Car {  
    public void model();  
    public void price();  
}  

class BMW implements Car {  
    @Override  
    public void model() {  
        System.out.println("BMW 5 Series");  
    }  
    @Override  
    public void price() {  
    System.out.println("Rs 65.40 Lakhs");  
    }  
} 
class Benz implements Car {  
    @Override  
    public void model() {  
        System.out.println("Mercedes-Benz Maybach S-Class");  
    }  
    @Override  
    public void price() {  
    System.out.println("Rs 3.40 Crore");  
    }  
} 
public class Showroom {

	private Car BMW;
	private Car Benz;
	
	public Showroom() {
		BMW = new BMW();
		Benz = new Benz();
	}
	
	public void bmwSale(){  
		BMW.model();  
		BMW.price();  
    }  
	
	public void benzSale(){  
		Benz.model();  
		Benz.price();  
    }
}
