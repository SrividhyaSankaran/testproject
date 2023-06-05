package testproject.sql;
import java.sql.*;

public class Calender {

	public static void main(String[] args) {
		   try {
			   
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/vidhdb", 
						"root", "Admin@123");
				System.out.println("Connected With the database successfully");
				Statement st =  con.createStatement();
				 
	            ResultSet resultSet = st.executeQuery(
	                "select * from users");
	            
	            while(resultSet.next())  {
	            	System.out.println("User ID: "+resultSet.getInt(1)+" User Name: "+resultSet.getString(2)+" Email: "+resultSet.getString(3));  
	            }
			} catch (SQLException e) {
				System.out.println("Connection Failed");
			}
		}
}
