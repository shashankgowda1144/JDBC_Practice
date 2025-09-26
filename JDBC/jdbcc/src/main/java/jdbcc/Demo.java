//package jdbcc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Demo {
// public static void main(String[] args) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
//		//Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop?user=postgres&password=root");
//		Statement stm=con.createStatement();
//		String sql="insert into register values(223,'Sandal','50','2')";
//		System.out.println("Data Inserted");
//		stm.execute(sql);
//		con.close();
//		
//	}catch(ClassNotFoundException e){
//		e.printStackTrace();
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//}
//}


package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
				java.sql.Statement stm=con.createStatement();
				stm.addBatch("insert into register values(101,'ram',20500,1)");
				stm.addBatch("insert into register values(102,'raj',20000,2)");
				stm.executeBatch();
				con.close();
				System.out.println("inserted");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
