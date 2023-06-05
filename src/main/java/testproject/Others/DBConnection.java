package testproject.Others;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.time.*;

public class DBConnection {

	public static void main(String[] args) {
		   try {
			   
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/vidhdb", 
						"root", "Admin@123");
				System.out.println("Welcome to CREDS !!!");
				Statement st =  con.createStatement();
				
				System.out.println("You can manage all your credit card details at one place !!");
				String card_no = "";
				Scanner io =  new Scanner(System.in);
				System.out.println("Enter your Credit Card Number to check your Discounts and Payable : ");
				card_no = io.nextLine();
				
				String q1 = "select * from customers where card_number = "+card_no;
				
	            ResultSet resultSet = st.executeQuery(q1);
	            LocalDate loc = LocalDate.now();
	            
	            String cardholderid = "";
	            while(resultSet.next())  {
	            	System.out.println("Customer Name : "+resultSet.getString(2)+" Customer ID: "+resultSet.getInt(1)); 
	            	System.out.println("Card Number : "+resultSet.getLong(3));
	            	cardholderid = resultSet.getString(1);
	            	
	            
	            	String q2 = "select a.id, b.c_id, c.company_name, a.petrol_expense,a.cashback_amount from monthly_expense a \r\n"
	            			+ "inner join customers b on a.card_holder_id = b.cust_id\r\n"
	            			+ "inner join company c on c.c_id = b.c_id \r\n"
	            			+ "where a.card_holder_id = "+cardholderid+" and c.company_name ='JP MORGAN' and month = "+loc.getMonthValue()+" and year = "+loc.getYear();
	            	System.out.println("kjcjvv");
		            ResultSet rs2 = st.executeQuery(q2);
		            
		            double totcb = 0.0;
		            int id = 0;
		            float cashback_amount = 0;
		            while(rs2.next()) {
		            	id = rs2.getInt(1);
		            	int total_petrol_exp = rs2.getInt(4);
		            	
		            	int cb_perc = 0;
		            	System.out.println(rs2.getInt(4));
		            	
		            	if(rs2.getInt(4) <= 80) { System.out.println("less 80");
		            		cb_perc = 1;
		            		cashback_amount = (total_petrol_exp * 1)/100;
		            		System.out.println(cashback_amount);
		            	}else if(rs2.getInt(4) <= 100) { System.out.println("less 100");
		            		cb_perc = 2;
		            		cashback_amount = (total_petrol_exp * 2)/100;
		            	}else if(rs2.getInt(4) <= 200) { System.out.println("less 200");
		            		cb_perc = 3;
		            		cashback_amount = (total_petrol_exp * 3)/100;
		            	}
		            	
		            
		            	System.out.println("You are applicable for the cashback percentage of : "+cb_perc);
		            	System.out.println("Your Cashback Amount : "+cashback_amount);
		            	
		            	
		            
		            
			            totcb = resultSet.getInt(5)+cashback_amount;
		            	
		            	String q3 = "update monthly_expenses set cashback_amount = "+totcb+" where id = "+id;
						
			            ResultSet rs3 = st.executeQuery(q3);
			            
			            
			            String q4 = "select p.product_name,sum(o.sold_qty) as total_quantity from orders o inner join products p on o.product_id = p.product_id group by p.product_name";
						
			            ResultSet rs4 = st.executeQuery(q4);
			            
			            
			            
			            String mem_id = "";
						Scanner in =  new Scanner(System.in);
						System.out.println("Enter your Member ID : ");
						mem_id = in.nextLine();
						
						Integer trip_type = 1;
						Scanner in1 =  new Scanner(System.in);
						System.out.println("Enter your Trip Type : 1 for Single Trip / 2 for Round Trip");
						trip_type = in1.nextInt();
		            
						LocalDate fromDate = null; String fdate = "";
						Scanner in2 =  new Scanner(System.in);
						System.out.println("Enter your From Date : (yyyy-MM-dd) ");
						fdate = in1.next();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						  
						fromDate= LocalDate.parse(fdate,formatter);  
						
						
						LocalDate toDate = null; String tdate = "";
						Scanner in3 =  new Scanner(System.in);
						System.out.println("Enter your To Date : (yyyy-MM-dd)  ");
						tdate = in3.next();
						toDate= LocalDate.parse(tdate,formatter);  
						
						int endMonth = toDate.getMonthValue();
						Boolean vip = true;
						Scanner in4 =  new Scanner(System.in);
						System.out.println("Enter you have VIP membership or not : true/false");
						vip = in4.nextBoolean();
						
						float total_price = 0;
						
						if(trip_type == 1) {
							int flatprice = 400;
							int perc = 18;
							
							if(vip) {
								perc = perc+6;
							}
							
							total_price = (400 * perc)/100;
							
						}else {
							int flatprice = 650;
							int perc = 38;
							
							
							if(endMonth > 1) {
								perc = 30;
							}
							if(vip) {
								perc = perc+6;
							}
							
							total_price = (650 * perc)/100;
							
						}
						System.out.println("Total Price : "+total_price);
						
						String q5 = "insert into ticket_payments value ("+mem_id+","+fromDate+","+toDate+","+trip_type+","+vip+","+total_price+")";
						
			            ResultSet rs5 = st.executeQuery(q5);
						
		            }
	            }
	            
			} catch (SQLException e) {
				System.out.println("Connection Failed");
				System.out.println(e.getMessage());
			}
		}
}
