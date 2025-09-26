package shopmanagement.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
 public static void main(String[] args) {
	try {
		//load/register driver
		Class.forName("org.postgresql.Driver");
		
		//create connection
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop","postgres","root");
		//Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop?user=postgres&password=root");
		
		//create statement
		Statement stm=con.createStatement();
		
		String sql="insert into product values(53,'Sandal','50','2')";
		System.out.println("Data Inserted");
		
		//execute sql statement
		stm.execute(sql);
		//close the connection
		con.close();
		
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
}


//
//package shopmanagement.ty;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class demo {
//
//	public static void main(String[] args) {
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
//				java.sql.Statement stm=con.createStatement();
//				stm.addBatch("insert into register values(201,'ram',20500,1)");
//				stm.addBatch("insert into register values(202,'raj',20000,2)");
//				stm.executeBatch();
//				con.close();
//				System.out.println("inserted");
//				
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		
//
//	}
//
//}