package testproject.designPatterns;

public class StatePattern {

	Controller controller;  
    StatePattern(String con) {  
       controller = new Controller();  
       //the following trigger should be made by the user  
       if(con.equalsIgnoreCase("marketing"))  
          controller.setMarketingConnection();  
       if(con.equalsIgnoreCase("sales"))  
          controller.setSalesConnection();  
       
       controller.open();  
       controller.close();  
       controller.update();  
    }  
      
      
    public static void main(String args[]) {  

    	System.out.println("State Pattern : Calling Marketing Department to get various states");
        new StatePattern("marketing");  
          
    }  
}
