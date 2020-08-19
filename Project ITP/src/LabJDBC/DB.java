package LabJDBC;

import java.sql.*;

public class DB {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 String url="jdbc:sqlserver://localhost:1433;databaseName=jdbcTest";
	         Connection con=DriverManager.getConnection(url,"Arosh","hello");
	         
	         
	         PreparedStatement ps =con.prepareStatement("insert into test values (?,?)");
	            
	            ps.setInt(1,13);
	            ps.setString(2,"Ann");
	            ps.executeUpdate();

	            ps.setInt(1,3);
	            ps.setString(2,"Sam");
	            ps.executeUpdate();
	         
	         con.close();
	         
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
