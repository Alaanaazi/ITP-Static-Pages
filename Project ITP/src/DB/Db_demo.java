package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;






public class Db_demo {
private static Connection connection;

public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Db_demo obj_DB=new Db_demo();
	System.out.println(obj_DB.get_connection());
}

	public static Connection get_connection() throws ClassNotFoundException,SQLException {
		   
		
		if (connection == null || connection.isClosed()) {
			    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				String url="jdbc:sqlserver://localhost:1433;databaseName=master";
			    connection=DriverManager.getConnection(url,"Arosh","hello");
			 
		}
			
			    return connection;
	}
}
