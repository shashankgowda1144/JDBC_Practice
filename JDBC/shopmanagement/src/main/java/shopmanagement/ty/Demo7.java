package shopmanagement.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo7 {
	public static void main(String[] args) {
		try {
			// Load / Register Driver
			Class.forName("org.postgresql.Driver");
			
			// Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop","postgres","root");
			
			// Create Statement
			PreparedStatement pstm=con.prepareStatement("insert into product values(?,?,?,?)");	
			
			// Exexute SQL Query
			pstm.setInt(1, 333);
			pstm.setString(2, "pen");
			pstm.setInt(3, 10);
			pstm.setInt(4, 4);
			
			pstm.execute();
			
			// Close Connection
			con.close();
			System.out.println("Inserted");
				
		} catch (SQLException e) {
				e.printStackTrace();
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}