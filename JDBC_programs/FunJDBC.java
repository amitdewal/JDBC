import java.sql.*;
class FunJDBC{



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
		     	 String q="insert into table1(tname,tcity) values (?,?)";
   
                          //create prepared statement
		     	  	     PreparedStatement pstmnt =con.prepareStatement(q);

		     	  	     pstmnt.setString(1,"dewal");
		     	  	     pstmnt.setString(2,"noida");
		     	  	     pstmnt.executeUpdate();
						System.out.println("values inserted....");

						con.close();
 
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