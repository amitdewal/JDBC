//this program for jdbc  first Program

import java.sql.*;
class FirstJDBC {

	public static void main(String[] args) 
	{
		     try
		     {
		     	// load the the driver
		     	  Class.forName("com.mysql.cj.jdbc.Driver");

		     	
		     	 //creating the connectoin

		     	  String url="jdbc:mysql://localhost:3306/amitdb";
		     	  String username="root";
		     	  String password="test";
		     	  	Connection con =DriverManager.getConnection(url,username,password);


		     	  	if(con.isClosed()){

		     	  		System.out.println("connectoin is closed");
		     	  	} else{
		     	  	    System.out.println("connectoin created");

		     	  	}
		   			  }catch(Exception e)
		    		 {
 						e.printStackTrace();
		     		}
	}
}