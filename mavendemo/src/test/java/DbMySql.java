
import java.io.IOException;
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;
public class DbMySql {
	public static void main(String[] args) throws IOException, ClassNotFoundException, 

	SQLException { 	
	String dburl = "jdbc:mysql://localhost:3306/emp12"; 
	String username = "root";
	String password = "1234"; 
	String query = "Select * from hello1"; 
	Class.forName("com.mysql.jdbc.Driver"); 
	Connection con= DriverManager.getConnection(dburl, username, password); 
	Statement stmt = con.createStatement(); 
	ResultSet rs = stmt.executeQuery(query); 
	 rs.next(); 
	{ 
	String name = rs.getString("name"); 
	String age = rs.getString("age"); 
	
	System.out.println(name); 
	System.out.println(age); 
	}
	con.close(); 
	} 
	
}
