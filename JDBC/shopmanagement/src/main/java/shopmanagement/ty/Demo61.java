package shopmanagement.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo61 {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			 
			try {
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop2", "postgres", "root");
				
				Statement stm = con.createStatement();
				
				stm.addBatch("insert into product values(1221,'ram',2002,10)");
				stm.addBatch("insert into product values(2552,'raj',2004,20)");
				
				stm.executeBatch();
				con.close();
				System.out.println("Inserted");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
