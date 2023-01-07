import java.sql.*;

class InsertJDBC{


	public static void main(String[] args) {
		 try
		     {
		     	// load the the driver
		     	  Class.forName("com.mysql.cj.jdbc.Driver");

		     	
		     	 //creating the connectoin

		     	  String url="jdbc:mysql://localhost:3306/amitdb";
		     	  String username="root";
		     	  String password="test";
		     	  	Connection con =DriverManager.getConnection(url,username,password);
		     	  		//create query
		     	 String q="create table table1 (tid int(20) primary key auto_increment ,tname varchar(200) not null ,tcity varchar(200))";
   
                          //create statement
		     	  	      Statement stmnt= con.createStatement();
		     	  	            stmnt.executeUpdate(q);
		     	  	            System.out.println("table created in db...");

		     	  	if(con.isClosed())
		     	  	{

		     	  		System.out.println("connectoin is closed");
		     	  	} else
		     	  	 {
		     	  	    System.out.println("connectoin created");

		     	  	 }
		     	  	 
		   			  }catch(Exception e)
		    		 {
 						e.printStackTrace();
		     	}
	}
}