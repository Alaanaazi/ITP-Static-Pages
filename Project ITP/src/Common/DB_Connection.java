package Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_Connection {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 
		 String url="jdbc:sqlserver://localhost:1433;databaseName=master";
		 String query="Select * from Users";
		   Connection con=DriverManager.getConnection(url,"Arosh","hello");
	
		   Statement st=con.createStatement();
		   
		   ResultSet rs=st.executeQuery(query);
		   
		   
		   rs.next();
		   String name=rs.getString("Names");
		   
		   System.out.println(name);
		   
		   st.close();
		   con.close();
		   
	}
	
	

	
	
}
