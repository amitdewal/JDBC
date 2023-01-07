import java.sql.*;
import java.io.*;


class ImageSave{


	public static void main(String[] args) {

		try
		{   // load the driver
		           Class.forName("com.mysql.cj.jdbc.Driver");
              //create connecetion
		          String url="jdbc:mysql://localhost:3306/amitdb";
		     	  String username="root";
		     	  String password="test";
		         Connection  con =DriverManager.getConnection(url,username,password);

			      String q="insert into images(pic) values(?)";

			     PreparedStatement pstmnt =con.prepareStatement(q);

			      FileInputStream fis = new FileInputStream("photo.png");
			      pstmnt.setBinaryStream(1,fis,fis.available());
			      pstmnt.executeUpdate();
			      System.out.println("Done...");



			}catch(Exception e)
		{ 
			System.out.println("Error !!");

		}
		
	}
}